/**
 * Contain example class for object-oriented programming discipline.
 *
 * @version 0.2022.0
 * @autor dykun
 *
 */

package ua.opu;
/**
 * Клас Client - імітує поведінку сутності "Клієнта".
 * Включає методи вводу номера телефону та повного імені клієнта
 */
public class Client extends User {





    /**
     * Змінна clientAddress
     * визначає адресу клієнта
     */

    public String clientAddress;

    /**
     * Змінна clientFullName
     * визначає повне ім'я клієнта
     */

    public String clientFullName;

    /**
     * Змінна clientPhoneNumber
     * визначає номер телефону клієнта
     */


    public long clientPhoneNumber;

    /**
     * Змінна pointName
     * визначає назву точки куди прийшов клієнт
     */

    public String reservedTime;

    public String pointName;

    /**
     * Змінна serviceID
     * визначає ID сервісу
     */

    public int serviceID;

    /**
     * Створення об'єкту - клієнт з заданими параметрами
     * @param clientAddress - адреса клієнта
     * @param clientFullName - повне ім'я клієнта
     * @param clientPhoneNumber - номер телефону клієнта
     * @param pointName - назва точки
     * @param serviceID - ID сервісу
     */

    public Client (String clientAddress, String clientFullName, long clientPhoneNumber, String pointName, int serviceID,
                    String clientLogin, String clientPassword, String reservedTime){

        super(clientLogin, clientPassword);

        this.clientAddress = clientAddress;
        this.clientFullName = clientFullName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.pointName = pointName;
        this.serviceID = serviceID;
        this.reservedTime = reservedTime;
    }


    /**
     * Метод inputClientFullName, який дозволяє вводити повне ім'я клієнта
     */
    public void inputClientFullName(){

    }


    /**
     * Метод повертає номер телефону клієнта
     * @return  getClientPhoneNumber номер телефону певного клієнта
     */
    public long getClientPhoneNumber(){
        return clientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Адреса клієнта: " + clientAddress + "\n" +
                "Ім'я клієнта: " + clientFullName + "\n" +
                "Номер телефону клієнта: " + clientPhoneNumber + "\n" +
                "Назва точки: " + pointName + "\n" +
                "ID сервісу: " + serviceID + "\n";
    }

    @Override
    void changePassword() {

    }
}

