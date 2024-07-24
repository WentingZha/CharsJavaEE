package com.zwt.charsjavaee.b_database.b5_jdbctemplate.handler;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;


public class BeanListHandler<T> implements ResultSetHandler<T>{

    private Class<T> beanClass;

    public BeanListHandler(Class<T> beanClass) {
        this.beanClass = beanClass;
    }

    @Override
    public List<T> handler(ResultSet rs) {

        List<T> list = new ArrayList<>();
        try {

            while(rs.next()) {

                T bean = beanClass.newInstance();

                ResultSetMetaData metaData = rs.getMetaData();

                int count = metaData.getColumnCount();

                for(int i = 1; i <= count; i++) {

                    String columnName = metaData.getColumnName(i);

                    Object value = rs.getObject(columnName);

                    PropertyDescriptor pd = new PropertyDescriptor(columnName.toLowerCase(),beanClass);

                    Method writeMethod = pd.getWriteMethod();
                    writeMethod.invoke(bean,value);
                }
                list.add(bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
