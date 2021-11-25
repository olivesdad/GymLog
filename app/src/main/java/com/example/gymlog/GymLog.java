package com.example.gymlog;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.gymlog.db.AppDatabase;

import java.util.Date;

@Entity(tableName = AppDatabase.GYMLOG_TABLE)
public class GymLog {

    @PrimaryKey(autoGenerate = true)
    private int mLogId;

    private String mExercise;
    private int mReps;
    private double mWeight;

    private Date mDate;

    public GymLog(String mExercise, int mReps, double mWeight) {
        this.mExercise = mExercise;
        this.mReps = mReps;
        this.mWeight = mWeight;

        mDate = new Date();
    }

    public int getMLogId() {
        return mLogId;
    }

    public void setMLogId(int mLogId) {
        this.mLogId = mLogId;
    }

    public String getMExercise() {
        return mExercise;
    }

    public void setMExercise(String mExercise) {
        this.mExercise = mExercise;
    }

    public int getMReps() {
        return mReps;
    }

    public void setMReps(int mReps) {
        this.mReps = mReps;
    }

    public double getMWeight() {
        return mWeight;
    }

    public void setMWeight(double mWeight) {
        this.mWeight = mWeight;
    }

    public Date getMDate() {
        return mDate;
    }

    public void setMDate(Date mDate) {
        this.mDate = mDate;
    }

    @Override
    public String toString() {
        String output;
        output = mDate + "\n" +
                mExercise +
                "\n" + mWeight +
                "\n" + mReps;
        return output;


    }
}
