/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.katheprc.calculator;

import com.katheprc.calculator.GUI.mainFrame;
import com.katheprc.calculator.logic.CalculatorLogic;

/**
 *
 * @author KathePrc
 */
public class Calculator implements CalculatorLogic {

    public static void main(String[] args) {
        mainFrame mf = new mainFrame();
        mf.setTitle("Just a simple calculator made by Katheprc <3");
        mf.setVisible(true);      
        mf.setLocationRelativeTo(null);
    }
}


