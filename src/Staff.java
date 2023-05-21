/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class Staff extends Officer{
    private String task;

    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "      Staff: " + "\n Name : " + name + ' ' + "\n Age : " + age + "\n Gender : " + gender + ' ' + "\n Address : " + address + ' ' + "\n Task : " + task;
    }
    
    
    
}
