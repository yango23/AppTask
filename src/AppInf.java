public class AppInf {

    //Переопределение метода toString для dataBase
    @Override
    public String toString() {
        return "AppInf{" +
                "id=" + id +
                ", flyNumber='" + flyNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", name='" + name + '\'' +
                ", flyDate='" + flyDate + '\'' +
                '}';
    }

    //ID
    private int id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Номер рейса
    private String flyNumber;

    public String getFlyNumber() {
        return flyNumber;
    }

    public void setFlyNumber(String fleNumber) {
        this.flyNumber = fleNumber;
    }

    //Направление
    private String destination;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //ФИО Пассажира
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Дата вылета
    private String flyDate;

    public String getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(String flyDate) {
        this.flyDate = flyDate;
    }

}
