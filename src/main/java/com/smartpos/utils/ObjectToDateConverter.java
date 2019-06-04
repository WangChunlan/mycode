package com.smartpos.utils;


import org.apache.commons.beanutils.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



class ObjectToDateConverter implements Converter {
    private static final List<String> former = new ArrayList<>(7);

    static {
        former.add("MM-dd");
        former.add("yyyy-MM");
        former.add("yyyy-MM-dd");
        former.add("yyyy-MM-dd hh");
        former.add("yyyy-MM-dd hh:mm");
        former.add("yyyy-MM-dd hh:mm:ss");
        former.add("yyyy-MM-dd hh:mm:ss.SSS");
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T convert(Class<T> type, Object value) {
        if (value instanceof Date) {
            return (T) value;
        }
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            String source = (String) value;
            if (!source.trim().equals("")) {
                if (source.matches("^\\d{1,2}-\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(0));
                }
                if (source.matches("^\\d{1,2}-\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(0));
                }
                if (source.matches("^\\d{4}-\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(1));
                }
                if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(2));
                }
                if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(3));
                }
                if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(4));
                }
                if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
                    return (T) parseDate(source, former.get(5));
                }
                if (source.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d+$")) {
                    return (T) parseDate(source, former.get(6));
                }

                throw new IllegalArgumentException("时间转换器错误：不支持此格式时间->" + source);
            }
        }
        return null;
    }




    private Date parseDate(String dateStr, String format) {
        Date date = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            date = dateFormat.parse(dateStr);
        } catch (Exception ignored) {
        }
        return date;
    }
}
