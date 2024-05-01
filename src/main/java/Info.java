public class Info {
    private String schoolId;
    private String courseCode;
    private boolean isFailed;

    public Info(String schoolId, String courseCode, boolean isFailed) {
        this.schoolId = schoolId;
        this.courseCode = courseCode;
        this.isFailed = isFailed;
    }

    public boolean isFailed() {
        return isFailed;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return schoolId + " " + courseCode + ": " + isFailed;
    }
}