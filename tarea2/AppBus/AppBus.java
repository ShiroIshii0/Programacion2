/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appbus;

import java.util.Random;

/**
 *
 * @author casa
 */
public class AppBus {

    public static void main(String[] args) {
        Random random = new Random();
        Bus bus = new Bus(true, 10, 12345, random, 3, 4);
        bus.mostrarEstadoAsientos();
        System.out.println("¿Cobro realizado? " + bus.gB());
    }
}
