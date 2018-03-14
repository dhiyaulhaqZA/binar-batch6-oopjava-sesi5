import java.util.List;

public class MainActivity implements MainView{

    public void onCreate() {
//         membuat object dari studentPresenter
        StudentPresenter studentPresenter = new StudentPresenter(this);
        //memanggil method dari studentPresenter
        studentPresenter.getStudentList();
    }

    @Override
    public void onLoading(boolean isLoading) {
        System.out.println("Loading " + isLoading);
    }

    @Override
    public void onSuccess(List<Student> students) {
        //menampilkan student satu per satu
        // kondisi itu boolean, true false
        // for (nilai awal; kondisi; iterasi)
        for (int i = 0; i < students.size(); i++) {
            // continue == lewati
            // berarti lewati student dengan status alumni

            if (students.get(i).getStatus().equals("alumni")) continue;
            //hanya berisi student dengan status selain alumni
            System.out.println("NIM : " + students.get(i).getNim());
            System.out.println("Name : " + students.get(i).getName());
            System.out.println("Class : " + students.get(i).getKlas());
            System.out.println("Status : " + students.get(i).getStatus());
            System.out.println();
        }
    }

    @Override
    public void onFailure(String errMsg) {
        System.out.println(errMsg);
    }
}
