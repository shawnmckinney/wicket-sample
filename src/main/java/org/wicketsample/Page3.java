/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;


import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;


/**
 * Wicket Sample Page 3
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class Page3 extends MyBasePage
{
    public Page3()
    {
        add( new Page3Form( "pageForm" ) );
    }

    /**
     * Page 3 Form
     */
    public class Page3Form extends Form
    {
        public Page3Form( String id )
        {
            super( id );
            add( new Label( "label3", "This is Page3." ) );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page3.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button1 Pressed" );
                    target.appendJavaScript( ";alert('Page3 Button1 Pressed');" );
                }
            } );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page3.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button2 Pressed" );
                    target.appendJavaScript( ";alert('Page3 Button2 Pressed');" );
                }
            } );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page3.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button3 Pressed" );
                    target.appendJavaScript( ";alert('Page3 Button3 Pressed');" );
                }
            } );
        }
    }
}
