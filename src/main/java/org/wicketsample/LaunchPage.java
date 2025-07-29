/*
 * © 2025 iamfortress.net
 */
package org.wicketsample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.wicket.markup.html.basic.Label;

/**
 * This Wicket Sample routes traffic here.  It displays list of page links at the top.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public class LaunchPage extends WicketSampleBasePage
{
    private static final Logger LOG = LoggerFactory.getLogger( LaunchPage.class.getName() );
    public LaunchPage()
    {
        add(new Label("label1", "You have access to the link(s) above."));
    }
}
