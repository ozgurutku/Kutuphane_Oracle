
package kütüphaneotomasyonu.data;

public class Logs {
    private int logID;
    private String logType ;
    private String relatedTable ;
    private int relatedID ;
    private String logTime  ;

    public Logs(int logID, String logType, String relatedTable,int relatedID, String logTime) {
        this.logID = logID;
        this.logType = logType;
        this.relatedTable = relatedTable;
        this.relatedID = relatedID;
        this.logTime = logTime;
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getRelatedTable() {
        return relatedTable;
    }

    public void setRelatedTable(String relatedTable) {
        this.relatedTable = relatedTable;
    }

    public int getRelatedID() {
        return relatedID;
    }

    public void setRelatedID(int relatedID) {
        this.relatedID = relatedID;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

}
