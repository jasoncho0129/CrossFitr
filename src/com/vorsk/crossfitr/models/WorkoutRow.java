package com.vorsk.crossfitr.models;

import android.content.ContentValues;

/**
 * Workout entry struct
 * 
 * This is a customized data container to hold an entry from the workout
 * table. Every DAO Model will have its own Row class definition.
 */
public class WorkoutRow extends SQLiteRow
{
	// Cols
	public String name;
	public String description;
	public long   workout_type_id;
	public int    record;
	public long   record_type_id;
	
	public WorkoutRow() {}
	
	public WorkoutRow(ContentValues vals)
	{
		super(vals);
		name            = vals.getAsString(WorkoutModel.COL_NAME);
		description     = vals.getAsString(WorkoutModel.COL_DESC);
		workout_type_id = vals.getAsLong(WorkoutModel.COL_WK_TYPE);
		record = vals.getAsInteger(WorkoutModel.COL_RECORD);
		record_type_id = vals.getAsLong(WorkoutModel.COL_REC_TYPE);
	}

	public ContentValues toContentValues()
	{
		ContentValues vals = super.toContentValues();
		vals.put(WorkoutModel.COL_NAME,  name);
		vals.put(WorkoutModel.COL_DESC,  description);
		vals.put(WorkoutModel.COL_WK_TYPE,  workout_type_id);
		vals.put(WorkoutModel.COL_RECORD,   record);
		vals.put(WorkoutModel.COL_REC_TYPE, record_type_id);
		return vals;
	}
	
	/**
	 * Returns the String to represent the row item
	 */
	public String toString()
	{
		return this.name;
	}
}