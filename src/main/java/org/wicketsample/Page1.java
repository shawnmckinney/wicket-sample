/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;

import org.apache.wicket.ajax.AjaxRequestTarget;
import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;

/**
 * Wicket Sample Page 1
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class Page1 extends WicketSampleBasePage
{
    public Page1()
    {
        add( new Page1Form( "pageForm" ) );
    }

    /**
     * Page 1 Form
     */
    public class Page1Form extends Form
    {
        public Page1Form( String id )
        {
            super( id );

            add( new Label( "label1", "This is Page1" ) );

            // TODO STEP 9a: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page1.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    logIt( target, "Page 1, Button 1 Pressed" );
                }
            } );

            // TODO STEP 9b: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page1.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    logIt( target, "Page 1, Button 2 Pressed" );
                }
            } );

            // TODO STEP 9c: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page1.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target, Form form )
                {
                    logIt( target, "Page 1, Button 3 Pressed" );
                }
            } );
        }
    }
}
