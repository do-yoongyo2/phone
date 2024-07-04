// Phone2 인터페이스 정의
interface Phone2 {
    String getBrand();
    String getSymbol();
}

// ApplePhone2 클래스
class ApplePhone2 implements Phone2 {
    @Override
    public String getBrand() {
        return "애플";
    }

    @Override
    public String getSymbol() {
        return "@";
    }
}

// SamsungPhone2 클래스
class SamsungPhone2 implements Phone2 {
    @Override
    public String getBrand() {
        return "삼송";
    }

    @Override
    public String getSymbol() {
        return "*";
    }
}

// User2 클래스
class User2 {
    private String name;
    private Phone2 phone;

    public User2(String name, Phone2 phone) {
        this.name = name;
        this.phone = phone;
    }

    public void purchasePhone() {
        System.out.println(name + "님이 " + phone.getBrand() + "폰을 구매했습니다.");
    }

    public void turnOnPhone() {
        System.out.println(name + "님이 " + phone.getBrand() + "폰을 켰습니다.");
        displayTurnOnMessage();
    }

    private void displayTurnOnMessage() {
        String symbol = phone.getSymbol();
        System.out.println(symbol + symbol + symbol + " 폰 켜지는 중 " + symbol + symbol + symbol);
    }
}

// Main2 클래스
class Main2 {
    public static void main(String[] args) {
        User2 jobs = new User2("잡스", new ApplePhone2());
        jobs.purchasePhone();
        jobs.turnOnPhone();

        System.out.println();

        User2 jaeyong = new User2("재용", new SamsungPhone2());
        jaeyong.purchasePhone();
        jaeyong.turnOnPhone();
    }
}
