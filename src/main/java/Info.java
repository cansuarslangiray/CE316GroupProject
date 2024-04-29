public class Info {
    private String schoolId;
    private boolean isFailed;
    public Info(String schoolId, boolean isFailed) {
        this.schoolId=schoolId;
        this.isFailed = isFailed;
    }

    public boolean isFailed() {
        return isFailed;
    }

    public String getSchoolId() {
        return schoolId;
    }


    @Override
    public String toString() {
        return schoolId + ": " + isFailed;
    }
}
