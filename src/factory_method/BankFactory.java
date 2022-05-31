/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_method;

/**
 *
 * @author kuted
 */
public class BankFactory {
//    private  static BankFactory instance;

    public BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case VIETCOMBANK -> {
                return new VietcomBank();
            }
            case TPBANK -> {
                return new TPBank();
            }
            default -> throw new AssertionError();
        }
    }
}
