package com.ivarrace.patterns.structural.adapter.examples.medidas;

import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloImperial;
import com.ivarrace.patterns.structural.adapter.examples.medidas.model.TornilloMetrica;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void adaptadorCoinciden(){
        TornilloMetrica tornilloMetrica = new TornilloMetrica();
        tornilloMetrica.setDiametro(2.54f);
        TornilloImperial tornilloImperial = new TornilloImperial();
        tornilloImperial.setDiametro(1);
        TornilloImperialAdapter adapter = new TornilloImperialAdapter(tornilloImperial);
        assertNotEquals("El diametro original no coincide", tornilloImperial.getDiametro(), tornilloMetrica.getDiametro());
        assertTrue("El diametro adaptado coincide", adapter.getDiametro()==tornilloMetrica.getDiametro());
    }

    @Test
    public void adaptadorNoCoinciden(){
        TornilloMetrica tornilloMetrica = new TornilloMetrica();
        tornilloMetrica.setDiametro(1);
        TornilloImperial tornilloImperial = new TornilloImperial();
        tornilloImperial.setDiametro(1);
        TornilloImperialAdapter adapter = new TornilloImperialAdapter(tornilloImperial);
        assertNotEquals("El diametro adaptado no coincide", adapter.getDiametro(), tornilloMetrica.getDiametro());
    }

}