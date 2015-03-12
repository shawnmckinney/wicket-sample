/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;


import org.apache.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;

public class Page1 extends MyBasePage
{
    private static final Logger LOG = Logger.getLogger( MyBasePage.class.getName() );

    public Page1()
    {
        add( new Page1Form( "pageForm" ) );
    }

    public class Page1Form extends Form
    {

        private static final String PAGE1 = "Page1";

        public Page1Form( String id )
        {
            super( id );

            add( new Label( "label1", "If you see this page, ROLE_TEST1 is activated within your session" ) );

            add( new IndicatingAjaxButton( "page1.button1" )
            //add( new FtIndicatingAjaxButton( "page1.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    String msg = "Page 1, Button 1 Pressed";
                    info( msg );
                    LOG.info( msg );
                    target.appendJavaScript(";alert('Page1 Button1 Pressed');");
                }
            } );
            add( new IndicatingAjaxButton( "page1.button2" )
            //add( new FtIndicatingAjaxButton( "page1.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Page 2, Button2 Pressed" );
                    target.appendJavaScript(";alert('Page1 Button2 Pressed');");
                }
            } );
            add( new IndicatingAjaxButton( "page1.button3" )
            //add( new FtIndicatingAjaxButton( "page1.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Page 3, Button3 Pressed" );
                    target.appendJavaScript(";alert('Page1 Button3 Pressed');");
                }
            } );
        }
    }
}
