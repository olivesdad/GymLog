package com.example.gymlog.db.typeConverters;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.util.Date;


public class DateTypeConverter {
    @TypeConverter
    public long dateToLong(Date date){
        return date.getTime();
    }
    @TypeConverter
    public Date convertLongtoDate(Long time){
        return new Date(time);
    }
}
