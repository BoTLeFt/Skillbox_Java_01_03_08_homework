public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute

        int devastationSpeed = 10; //10 litres per minute

        int fillingSpeedAfterDevastation = fillingSpeed - devastationSpeed;
        if (fillingSpeedAfterDevastation<=0) {
            System.out.println("Impossible to fill pool");
        }
        int pool = 0;
        int itterationsCount = 0;
        while (pool<volume){
            pool = pool + fillingSpeedAfterDevastation;
            itterationsCount = itterationsCount + 1;
        }
        System.out.println(itterationsCount+" minutes");
    }
}