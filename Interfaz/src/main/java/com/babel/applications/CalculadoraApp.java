package com.babel.applications;

import com.babel.models.DobleNumero;
import com.babel.services.ICalculadoraService;
import com.babel.services.IGestorUsuarioService;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraApp {
    private final ICalculadoraService calculadoraService;
    private final IGestorUsuarioService gestorUsuarioService;

    public CalculadoraApp(ICalculadoraService calculadoraService, IGestorUsuarioService gestorUsuarioService){
        this.calculadoraService = calculadoraService;
        this.gestorUsuarioService = gestorUsuarioService;
    }

    public void run(){
        int optionUser;

        do {
            optionUser = gestorUsuarioService.menu();
            switch (optionUser) {
                case 1 -> {
                    DobleNumero numeros = gestorUsuarioService.numeros();
                    System.out.println("El resultado es: " + calculadoraService.sumar(numeros.getNum1(), numeros.getNum2()));
                }
                case 2 -> {
                    DobleNumero numeros = gestorUsuarioService.numeros();
                    System.out.println("El resultado es: " + calculadoraService.restar(numeros.getNum1(), numeros.getNum2()));
                }
                case 3 -> {
                    DobleNumero numeros = gestorUsuarioService.numeros();
                    System.out.println("El resultado es: " + calculadoraService.multiplicar(numeros.getNum1(), numeros.getNum2()));
                }
                case 4 -> {
                    DobleNumero numeros = gestorUsuarioService.numeros();
                    System.out.println("El resultado es: " + calculadoraService.dividir(numeros.getNum1(), numeros.getNum2()));
                }
                case 0 -> {

                }
            }
        } while (optionUser != 0);
    }
}
