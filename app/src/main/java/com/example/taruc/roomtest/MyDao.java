package com.example.taruc.roomtest;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

/**
 * Created by taruc on 23/5/2018.
 */
@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);

}
