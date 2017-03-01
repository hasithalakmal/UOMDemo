import com.cake.service.StudentService;
import com.cake.service.StudentServiceImpl;
import org.json.JSONObject;

/**
 * Created by hasithagamage on 3/1/17.
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        StudentService ss = new StudentServiceImpl();
        ss.createStudent("Hasitha", 1);
        JSONObject jo = new JSONObject();
    }
}

