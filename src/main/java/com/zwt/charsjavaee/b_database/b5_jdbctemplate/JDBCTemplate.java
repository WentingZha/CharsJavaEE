package com.zwt.charsjavaee.b_database.b5_jdbctemplate;

import com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler.ResultSetHandler;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate {
    private DataSource dataSource;
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;

    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Long queryForScalar(String sql, ResultSetHandler<Long> rsh, Object...objs){
        Long value = null;

        try{
            con = dataSource.getConnection();

            pst = con.prepareStatement(sql);

            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            int count = parameterMetaData.getParameterCount();

            if(count != objs.length) {
                throw new RuntimeException("The number of parameters are not match");
            }

            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            rs = pst.executeQuery();

            value = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DataSourceUtils.close(con,pst,rs);
        }

        return value;
    }

    public <T> List<T> queryForList(String sql, ResultSetHandler<T> rsh, Object...objs){
        List<T> list = new ArrayList<>();

        try{
            con = dataSource.getConnection();

            pst = con.prepareStatement(sql);

            ParameterMetaData parameterMetaData = pst.getParameterMetaData();

            int count = parameterMetaData.getParameterCount();

            if(count != objs.length) {
                throw new RuntimeException("The number of parameters are not match");
            }

            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            rs = pst.executeQuery();

            list = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DataSourceUtils.close(con,pst,rs);
        }
        return list;
    }

    public <T> T queryForObject(String sql, ResultSetHandler<T> rsh,Object...objs){
        T obj = null;

        try{

            con = dataSource.getConnection();

            pst = con.prepareStatement(sql);

            ParameterMetaData parameterMetaData = pst.getParameterMetaData();

            int count = parameterMetaData.getParameterCount();

            if(count != objs.length) {
                throw new RuntimeException("The number of parameters are not match");
            }


            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }


            rs = pst.executeQuery();

            obj = rsh.handler(rs);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            DataSourceUtils.close(con,pst,rs);
        }


        return obj;
    }

    public int update(String sql,Object...objs) {

        int result = 0;

        try{

            con = dataSource.getConnection();

            pst = con.prepareStatement(sql);

            ParameterMetaData parameterMetaData = pst.getParameterMetaData();
            int count = parameterMetaData.getParameterCount();

            if(count != objs.length) {
                throw new RuntimeException("The number of parameters are not match");
            }

            for(int i = 0; i < objs.length; i++) {
                pst.setObject(i+1,objs[i]);
            }

            result = pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DataSourceUtils.close(con,pst);
        }

        return result;
    }
}
