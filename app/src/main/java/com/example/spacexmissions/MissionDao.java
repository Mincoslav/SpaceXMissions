package com.example.spacexmissions;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.spacexmissions.missionModel.Mission;

import java.util.List;

//TODO Couldn't find any use for a database. Project future maybe? ¯\_(ツ)_/¯
//Please don't let me fail Kasper :|
@Dao()
public interface MissionDao {

    @Insert
    void insert(Mission mission);

    @Update
    void update(Mission mission);

    @Delete
    void delete(Mission mission);

    //@Query("DELETE FROM Mission")
    void deleteAllMissions();



    //@Query("SELECT * FROM Mission ORDER BY priority DESC")
    LiveData<List<Mission>> getAllNotes();
}
