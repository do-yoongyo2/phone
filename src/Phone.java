// Phone 인터페이스 정의
interface Phone {
    void purchase(String userName);
    void turnOn(String userName);
    void displayTurnOnMessage();
    String getBrand();
    String getSymbol();
}

// ApplePhone 클래스
class ApplePhone implements Phone {
    @Override
    public void purchase(String userName) {
        System.out.println(userName + "님이 " + getBrand() + "폰을 구매했습니다.");
    }

    @Override
    public void turnOn(String userName) {
        System.out.println(userName + "님이 " + getBrand() + "폰을 켰습니다.");
        displayTurnOnMessage();
    }

    @Override
    public void displayTurnOnMessage() {
        System.out.println(getSymbol() + " 폰 켜지는 중 " + getSymbol());
    }

    @Override
    public String getBrand() {
        return "애플";
    }

    public String getSymbol() {return "@@@";}
}

// SamsungPhone 클래스
class SamsungPhone implements Phone {
    @Override
    public void purchase(String userName) {
        System.out.println(userName + "님이 " + getBrand() + "폰을 구매했습니다.");
    }

    @Override
    public void turnOn(String userName) {
        System.out.println(userName + "님이 " + getBrand() + "폰을 켰습니다.");
        displayTurnOnMessage();
    }

    @Override
    public void displayTurnOnMessage() {
        System.out.println(getSymbol() + " 폰 켜지는 중 " + getSymbol());
    }
    @Override
    public String getBrand() {
        return "삼송";
    }

    public String getSymbol() {return "***";}
}

// User 클래스
class User {
    private String name;
    private Phone phone;

    public User(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void purchasePhone() {
        phone.purchase(name);
    }

    public void turnOnPhone() {
        phone.turnOn(name);
    }
}

// Main 클래스
class Main {
    public static void main(String[] args) {
        User jobs = new User("잡스", new ApplePhone());
        jobs.purchasePhone();
        jobs.turnOnPhone();

        System.out.println();

        User jaeyong = new User("재용", new SamsungPhone());
        jaeyong.purchasePhone();
        jaeyong.turnOnPhone();
    }
}
