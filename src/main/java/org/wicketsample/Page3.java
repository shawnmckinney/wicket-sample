/*
 * © 2025 iamfortress.net
 */
package org.wicketsample;


import com.googlecode.wicket.jquery.ui.form.button.IndicatingAjaxButton;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;

//import org.apache.directory.fortress.web.control.FtIndicatingAjaxButton;


/**
 * Wicket Sample Page 3
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class Page3 extends WicketSampleBasePage
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

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "wspage3.button1" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 3, Button 1 Pressed" );
                }
            } );

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "wspage3.button2" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 3, Button 2 Pressed" );
                }
            } );

            // TODO STEP: change to FtIndicatingAjaxButton:
            add( new IndicatingAjaxButton( "wspage3.button3" )
            {
                @Override
                protected void onSubmit( AjaxRequestTarget target )
                {
                    logIt( target, "Page 3, Button 3 Pressed" );
                }
            } );
        }
    }
}
