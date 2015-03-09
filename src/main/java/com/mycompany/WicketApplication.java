/*
 * This is free and unencumbered software released into the public domain.
 */
package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 */
public class WicketApplication extends WebApplication
{    	
    //@Override
    //public Session newSession(Request request, Response response)
    //{
    //    return new RbacSession(request);
   // }

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return LaunchPage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();
		// add your configuration here
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
        getMarkupSettings().setStripWicketTags(true);
        //mountPage("index.html", LaunchPage.class);
        //mountPage("home.html", LaunchPage.class);
        //mountPage("/", LaunchPage.class);
	}
}
