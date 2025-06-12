import java.util.Random;
import org.javaturk.ipj.ch02.Selam;

Random random = new Random();

void main() {
    System.out.println("Hello World!");
    saySalam();
}

void saySalam(){
    Selam object = new Selam();
    int limit = random.nextInt(100);
    for(int i = 0; i < limit; i++)
        System.out.println(STR."\{i} _ \{object.greet("Nalan")}");
}
