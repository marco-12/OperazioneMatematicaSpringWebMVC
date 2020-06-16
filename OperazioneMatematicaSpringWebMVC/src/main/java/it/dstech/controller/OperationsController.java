package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OperationsController {
	
	@RequestMapping(value = "/inserisciNumeri", method = RequestMethod.POST)
	public ModelAndView scelta(@RequestParam("metodo") String metodo, Model model) {
		return new ModelAndView("inserisciNumeri", "metodo", metodo);
	}
	
	@RequestMapping(value = "/risultato", method = RequestMethod.POST)
	public ModelAndView inserisciNumeri(@RequestParam("numero1") int num1, @RequestParam("numero2") int num2, @RequestParam("metodo") String metodo, Model model) {

		GestioneOperazioni gestione = new GestioneOperazioni();
		
		if ("somma".equals(metodo)) {
			model.addAttribute("somma", gestione.somma(num1, num2));
		}
		
		if ("sottrazione".equals(metodo)) {
			model.addAttribute("sottrazione", gestione.sottrazione(num1, num2));
		}
		
		if ("moltiplicazione".equals(metodo)) {
			model.addAttribute("somma", gestione.somma(num1, num2));
		}
		
		if ("divisione".equals(metodo)) {
			model.addAttribute("divisione", gestione.divisione(num1, num2));
		}
				
		
		return new ModelAndView("risultato");
	}

	
}
