package com.generation.ecommerce.model.entities;



import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Cart 
{
	//Per salvare nel carrello item aggiunti o rimossi
	//Creiamo una mappa con chiave:Item e valore:Integer
	 Map<Item, Integer> cartItems = new HashMap<Item, Integer>();
	
	//Questo metodo aggiunge copie ad un item nel carrello
	//Come parametri mettiamo item a cui si vogliono aggiungere le copie
	//e il numero di copie da aggiungere (nel nostro caso sarà 1, perchè ad ogni click aggiungeremo una copia)
	public void add(Item b, Integer n)
	{
		//Se la mappa contiene item
		if(cartItems.containsKey(b))
			//Allora aggiungiamo a quel item una copia
			cartItems.put(b, cartItems.get(b) + n);
		else
			//Altrimenti creiamo item e impostiamo la copia
			//passata come parametro n 
			cartItems.put(b,n);
	}
	
	//Facciamo anche un metodo per rimuovere le copie di item dal carrello
	public void remove(Item b, Integer n)
	{
		//Se la mappa non contiene item ricevuto come parametro (esempio: coca cola di Irene)
		if(!cartItems.containsKey(b))
			//Non possiamo rimuovere  coca cola se non c'è
			//Quindi terminiamo il metodo con return 
			return;
		
		//Se invece il numero di copie presenti è minore uguale al numero di copie da rimuovere
		if(cartItems.get(b) <= n)
			//Allora rimuoviamo tutto il libro dal carrello
			cartItems.remove(b);
		else
			//Altrimenti sovrascriviamo il valore della chiave b
			//E ci mettiamo il valore precedente meno la copia da rimuovere
			//ESEMPIO: items.get(b)=8 e n=1 ---->  8-1 = 7
			cartItems.put(b, cartItems.get(b) - n);
	}
	
	
	public int getCopies(Item b)
	{
		return cartItems.get(b)== null ? 0: cartItems.get(b);
	}
	
	public double getTotalPrice(Item b)
	{
		return getCopies(b)*b.getCost();
	}
	
	public double getTotalPrice()
	{
		double res=0;
		for(Item b: cartItems.keySet())
			res+= getTotalPrice(b);
		
		return res;
	}
	
	public Order cartToOrder()
	{
		Order ordine = new Order();
		ordine.setOrderDate(LocalDate.now());
		ordine.setDeliveryDate(LocalDate.now());
		
		String items = "";
		for(Item i: cartItems.keySet())
			items+=i.getId()+":"+cartItems.get(i)+",";
		
		ordine.setItems(items);
		
		return ordine;
	}
	
}
