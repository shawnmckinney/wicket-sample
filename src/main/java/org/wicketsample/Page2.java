/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;


import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;

//import org.apache.directory.fortress.web.control.FtIndicatingAjaxButton;


/**
 * Wicket Sample Page 2
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class Page2 extends WicketSampleBasePage
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

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 2, Button 1 Pressed" );
                }
            } );

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 2, Button 2 Pressed" );
                }
            } );

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "page2.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 2, Button 3 Pressed" );
                }
            } );
        }
    }
}
