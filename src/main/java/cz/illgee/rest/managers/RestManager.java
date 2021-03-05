import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.HashMap;


@ApplicationScoped
public class RestManager implements Serializable {
    public static Object getAnimal;
    static HashMap<Integer, HashMap<String, String>> animal = new HashMap<>();
    static Integer number = 0;
    static String age;
    static String name;

    public void getAnimalIn() {
        if (number != null && animal.get(number) != null) {
            Response.ok(animal.get(number)).build();
        } else {
            Response.ok("Animal not found").build();
        }
    }
    public void deleteAnimal() {
        if (number != null) {
            anim.remove(number);
        }
    }
    public void newAnimal() {
        if (name != null && vek != null) {
            HashMap<String, String> newAnimal = new HashMap<>();
            newAnimal.put("Name", name);
            newAnimal.put("Age", vek);
            animal.put(number, newAnimal);
            number++;
            Response.ok(animal).build();
        } else {
            Response.ok("Enter name and age").build();
        }
    }
    public void changeAnimal(){
        if(animal.get(number) != null && number != null && name != null && age != null){
            HashMap<String,String> newAnimal = new HashMap<>();
            newAnimal.put("Name", nazev);
            newAnimal.put("Age", vek);
            animal.put(number, newAnimal);
        }
        Response.ok(animal).build();
    }
}
























