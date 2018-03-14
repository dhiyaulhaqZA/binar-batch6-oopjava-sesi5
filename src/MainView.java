import java.util.List;

public interface MainView {
    void onLoading(boolean isLoading);

    void onSuccess(List<Student> students);

    void onFailure(String errMsg);
}
