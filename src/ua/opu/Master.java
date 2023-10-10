/**
 * Contain example class for object-oriented programming discipline.
 *
 * @version 0.2022.0
 * @autor dykun
 *
 */

package ua.opu;

import java.util.Objects;
/**
 * Клас Master - імітує поведінку сутності "Майстера".
 * Включає методи вводу номера телефону та повного імені майстера
 */
public class Master extends User {

    /**
     * Змінна masterFullName
     * визначає повне ім'я майстера
     */

    public String masterFullName;

    /**
     * Змінна masterAddress
     * визначає адресу майстера
     */

    public String masterAddress;

    /**
     * Змінна masterPhoneNumber
     * визначає номер телефону майстера
     */

    public long masterPhoneNumber;

    /**
     * Змінна pointName
     * визначає ім'я точки де працює майстер
     */

    public String pointName;

    /**
     * Змінна specialization
     * визначає спелізацію майстера
     */

    public String specialization;

    /**
     * Створення об'єкту - майстер з заданими параметрами
     * @param masterFullName - повне ім'я майстера
     * @param masterAddress - адреса майстера
     * @param masterPhoneNumber - номер телефону майстера
     * @param pointName - назва точки
     * @param specialization - спеціалізація
     */
    public Master (String masterFullName, String masterAddress, long masterPhoneNumber, String pointName,
                  String specialization, String masterLogin, String  masterPassword){

        super(masterLogin, masterPassword);

        this.masterFullName = masterFullName;
        this.masterAddress = masterAddress;
        this.masterPhoneNumber = masterPhoneNumber;
        this.pointName = pointName;
        this.specialization = specialization;
    }

    /**
     * Метод inputMasterFullName, за допомогою якого можна ввести повне ім'я майстера
     */

    public void inputMasterFullName(){

}

    /**
     * Метод inputMasterPhoneNumber, за допомогою якого можна ввести номер телефону майстера
     */

    public void inputMasterPhoneNumber(){

}

    /**
     * Метод повертає повне ім'я майстера
     * @return повне ім'я певного майстера
     */
    public String getSpecialization(){
        return specialization;
    }

    @Override
    public String toString() {
        return "Ім'я майстера: " + masterFullName + "\n" +
                "Адреса майстера: " + masterAddress + "\n" +
                "Номер телефону майстера: " + masterPhoneNumber + "\n" +
                "Назва точки: " + pointName + "\n" +
                "Спеціалізація: " + specialization + "\n";
    }

    @Override
    void changePassword() {

    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }

        if (object instanceof Master) {
            Master thatMaster = (Master) object;

            if (!thatMaster.masterFullName.equals(this.masterFullName)){
                return false;
            }
            if (thatMaster.masterAddress != this.masterAddress){
                return false;
            }
            if (!thatMaster.pointName.equals(this.pointName)){
                return false;
            }
            if (!thatMaster.specialization.equals(this.specialization)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(masterFullName, masterAddress, pointName, specialization);
    }

}
