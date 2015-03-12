/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;


import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;


/**
 * Wicket Sample Page 2
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class Page2 extends MyBasePage
{
    public Page2()
    {
        add( new Page2Form( "pageForm" ) );
    }

    /**
     * Page 2 Form
     */
    public class Page2Form extends Form
    {
        public Page2Form( String id )
        {
            super( id );

            add( new Label( "label2", "This is Page2" ) );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button1 Pressed" );
                    target.appendJavaScript(";alert('Page2 Button1 Pressed');");
                }
            } );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button2 Pressed" );
                    target.appendJavaScript( ";alert('Page2 Button2 Pressed');" );
                }
            } );

            // TODO: for secure buttons, change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    info( "Button3 Pressed" );
                    target.appendJavaScript( ";alert('Page2 Button3 Pressed');" );
                }
            } );
        }
    }
}
