/**
 * Contain example class for object-oriented programming discipline.
 *
 * @version 0.2022.0
 * @autor dykun
 *
 */

package ua.opu;
/**
 * Клас Service - імітує поведінку сутності "Сервісу".
 * Включає методи зміни часу роботи сервісу та підрахунку коштів за певний сервіс
 */
public class Service {

    /**
     * Змінна name
     * визначає назву сервісу
     */

    public String name;

    /**
     * Змінна price
     * визначає ціну за сервіс
     */

    public int price;

    /**
     * Змінна serviceID
     * визначає ID сервісу
     */

    public int serviceID;

    /**
     * Змінна serviceType
     * визначає тип сервісу
     */

    public String serviceType;

    /**
     * Змінна serviceType
     * визначає час коли працює сервіс
     */

    public int workingTime;

    /**
     * Створення об'єкту - сервіс з заданими параметрами
     * @param name - ім'я
     * @param price - ціна
     * @param serviceID - ID сервісу
     * @param serviceType - тип сервісу
     * @param workingTime - робочий час
     */

    public Service (String name, int price, int serviceID, String serviceType, int workingTime){
    this.name = name;
    this.price = price;
    this.serviceID = serviceID;
    this.serviceType = serviceType;
    this.workingTime = workingTime;
    }

    /**
     * Метод changeWorkingTime, який дозволяє змінювати час роботи сервісу
     */
    public void changeWorkingTime(){

    }

    /**
     * Метод countPrice, який дозволяє робити підрахунок коштів за роботу певного сервісу
     */

    public void maxPrice(){

    }

    /**
     * Метод повертає ID сервісу
     * @return ID певного сервісу
     */
    public int getServiceID(){
        return serviceID;
    }
}
