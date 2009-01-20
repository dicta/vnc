// This class was generated from android.androidVNC.IConnectionBean by a tool
// Do not edit this file directly
package android.androidVNC;

public abstract class AbstractConnectionBean extends com.antlersoft.android.dbimpl.IdImplementationBase implements IConnectionBean {

    public static final String GEN_TABLE_NAME = "CONNECTION_BEAN";
    public static final int GEN_COUNT = 8;

    // Field constants
    public static final String GEN_FIELD__ID = "_ID";
    public static final int GEN_ID__ID = 0;
    public static final String GEN_FIELD_NICKNAME = "NICKNAME";
    public static final int GEN_ID_NICKNAME = 1;
    public static final String GEN_FIELD_ADDRESS = "ADDRESS";
    public static final int GEN_ID_ADDRESS = 2;
    public static final String GEN_FIELD_PORT = "PORT";
    public static final int GEN_ID_PORT = 3;
    public static final String GEN_FIELD_PASSWORD = "PASSWORD";
    public static final int GEN_ID_PASSWORD = 4;
    public static final String GEN_FIELD_COLORMODEL = "COLORMODEL";
    public static final int GEN_ID_COLORMODEL = 5;
    public static final String GEN_FIELD_FORCEFULL = "FORCEFULL";
    public static final int GEN_ID_FORCEFULL = 6;
    public static final String GEN_FIELD_REPEATERID = "REPEATERID";
    public static final int GEN_ID_REPEATERID = 7;

    // SQL Command for creating the table
    public static String GEN_CREATE = "CREATE TABLE CONNECTION_BEAN (" +
    "_ID INTEGER PRIMARY KEY AUTOINCREMENT," +
    "NICKNAME TEXT," +
    "ADDRESS TEXT," +
    "PORT INTEGER," +
    "PASSWORD TEXT," +
    "COLORMODEL TEXT," +
    "FORCEFULL INTEGER," +
    "REPEATERID TEXT" +
    ")";

    // Members corresponding to defined fields
    private long gen__Id;
    private java.lang.String gen_nickname;
    private java.lang.String gen_address;
    private int gen_port;
    private java.lang.String gen_password;
    private java.lang.String gen_colorModel;
    private boolean gen_forceFull;
    private java.lang.String gen_repeaterId;


    public String Gen_tableName() { return GEN_TABLE_NAME; }

    // Field accessors
    public long get_Id() { return gen__Id; }
    public void set_Id(long arg__Id) { gen__Id = arg__Id; }
    public java.lang.String getNickname() { return gen_nickname; }
    public void setNickname(java.lang.String arg_nickname) { gen_nickname = arg_nickname; }
    public java.lang.String getAddress() { return gen_address; }
    public void setAddress(java.lang.String arg_address) { gen_address = arg_address; }
    public int getPort() { return gen_port; }
    public void setPort(int arg_port) { gen_port = arg_port; }
    public java.lang.String getPassword() { return gen_password; }
    public void setPassword(java.lang.String arg_password) { gen_password = arg_password; }
    public java.lang.String getColorModel() { return gen_colorModel; }
    public void setColorModel(java.lang.String arg_colorModel) { gen_colorModel = arg_colorModel; }
    public boolean getForceFull() { return gen_forceFull; }
    public void setForceFull(boolean arg_forceFull) { gen_forceFull = arg_forceFull; }
    public java.lang.String getRepeaterId() { return gen_repeaterId; }
    public void setRepeaterId(java.lang.String arg_repeaterId) { gen_repeaterId = arg_repeaterId; }

    public android.content.ContentValues Gen_getValues() {
        android.content.ContentValues values=new android.content.ContentValues();
        values.put(GEN_FIELD__ID,Long.toString(this.gen__Id));
        values.put(GEN_FIELD_NICKNAME,this.gen_nickname);
        values.put(GEN_FIELD_ADDRESS,this.gen_address);
        values.put(GEN_FIELD_PORT,Integer.toString(this.gen_port));
        values.put(GEN_FIELD_PASSWORD,this.gen_password);
        values.put(GEN_FIELD_COLORMODEL,this.gen_colorModel);
        values.put(GEN_FIELD_FORCEFULL,(this.gen_forceFull ? "1" : "0"));
        values.put(GEN_FIELD_REPEATERID,this.gen_repeaterId);
        return values;
    }

    /**
     * Return an array that gives the column index in the cursor for each field defined
     * @param cursor Database cursor over some columns, possibly including this table
     * @return array of column indices; -1 if the column with that id is not in cursor
     */
    public int[] Gen_columnIndices(android.database.Cursor cursor) {
        int[] result=new int[GEN_COUNT];
        result[0] = cursor.getColumnIndex(GEN_FIELD__ID);
        result[1] = cursor.getColumnIndex(GEN_FIELD_NICKNAME);
        result[2] = cursor.getColumnIndex(GEN_FIELD_ADDRESS);
        result[3] = cursor.getColumnIndex(GEN_FIELD_PORT);
        result[4] = cursor.getColumnIndex(GEN_FIELD_PASSWORD);
        result[5] = cursor.getColumnIndex(GEN_FIELD_COLORMODEL);
        result[6] = cursor.getColumnIndex(GEN_FIELD_FORCEFULL);
        result[7] = cursor.getColumnIndex(GEN_FIELD_REPEATERID);
        return result;
    }

    /**
     * Populate one instance from a cursor 
     */
    public void Gen_populate(android.database.Cursor cursor,int[] columnIndices) {
        if ( columnIndices[GEN_ID__ID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID__ID])) {
            gen__Id = cursor.getLong(columnIndices[GEN_ID__ID]);
        }
        if ( columnIndices[GEN_ID_NICKNAME] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_NICKNAME])) {
            gen_nickname = cursor.getString(columnIndices[GEN_ID_NICKNAME]);
        }
        if ( columnIndices[GEN_ID_ADDRESS] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_ADDRESS])) {
            gen_address = cursor.getString(columnIndices[GEN_ID_ADDRESS]);
        }
        if ( columnIndices[GEN_ID_PORT] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_PORT])) {
            gen_port = (int)cursor.getInt(columnIndices[GEN_ID_PORT]);
        }
        if ( columnIndices[GEN_ID_PASSWORD] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_PASSWORD])) {
            gen_password = cursor.getString(columnIndices[GEN_ID_PASSWORD]);
        }
        if ( columnIndices[GEN_ID_COLORMODEL] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_COLORMODEL])) {
            gen_colorModel = cursor.getString(columnIndices[GEN_ID_COLORMODEL]);
        }
        if ( columnIndices[GEN_ID_FORCEFULL] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_FORCEFULL])) {
            gen_forceFull = (cursor.getInt(columnIndices[GEN_ID_FORCEFULL]) != 0);
        }
        if ( columnIndices[GEN_ID_REPEATERID] >= 0 && ! cursor.isNull(columnIndices[GEN_ID_REPEATERID])) {
            gen_repeaterId = cursor.getString(columnIndices[GEN_ID_REPEATERID]);
        }
    }

    /**
     * Populate one instance from a ContentValues 
     */
    public void Gen_populate(android.content.ContentValues values) {
        gen__Id = values.getAsLong(GEN_FIELD__ID);
        gen_nickname = values.getAsString(GEN_FIELD_NICKNAME);
        gen_address = values.getAsString(GEN_FIELD_ADDRESS);
        gen_port = (int)values.getAsInteger(GEN_FIELD_PORT);
        gen_password = values.getAsString(GEN_FIELD_PASSWORD);
        gen_colorModel = values.getAsString(GEN_FIELD_COLORMODEL);
        gen_forceFull = (values.getAsInteger(GEN_FIELD_FORCEFULL) != 0);
        gen_repeaterId = values.getAsString(GEN_FIELD_REPEATERID);
    }
}
