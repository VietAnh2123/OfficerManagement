/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AD
 */
public class Worker extends Officer{
    private int level;

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "      Worker: " + "\n Name : " + name + ' ' + "\n Age : " + age + "\n Gender : " + gender + ' ' + "\n Address : " + address + ' ' + "\n Level : " + level;
    }
    
    
    
    
}
