import java.util.List;

public class StudentPresenter {
    private MainView mainView;

    public StudentPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void getStudentList() {
        mainView.onLoading(true);

        List<Student> students = new StudentGenerator().generateStudent();

        mainView.onLoading(false);

        if (students != null) {
            mainView.onSuccess(students);
        } else {
            mainView.onFailure("Error : data null");
        }
    }
}
