/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;

import org.apache.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

import javax.servlet.http.HttpServletRequest;

/**
 * Base class for wicketsample project.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public abstract class WicketSampleBasePage extends WebPage
{
/*
    // TODO STEP 8a: enable fortress spring bean injection here:
    @SpringBean
    private AccessMgr accessMgr;
    @SpringBean
    private J2eePolicyMgr j2eePolicyMgr;
*/

    public WicketSampleBasePage()
    {
/*
        // TODO STEP 8b: uncomment to startup fortress session:
        try
        {
            SecUtils.enableFortress( this, ( HttpServletRequest ) getRequest().getContainerRequest(), j2eePolicyMgr, accessMgr );
        }
        catch (SecurityException se)
        {
            String error = "WicketSampleBasePage caught security exception : " + se;
            LOG.warn( error );
        }
*/
        // TODO STEP 8b: change to FtBookmarkablePageLink:
        add( new BookmarkablePageLink( "page1.link", Page1.class ) );
        add( new BookmarkablePageLink( "page2.link", Page1.class ) );
        add( new BookmarkablePageLink( "page3.link", Page1.class ) );
        final Link actionLink = new Link( "logout.link" )
        {
            @Override
            public void onClick()
            {
                setResponsePage(LogoutPage.class);
            }
        };
        add( actionLink );
        add( new Label( "footer", "This is free and unencumbered software released into the public domain." ) );
    }

    /**
     * Used by the child pages.
     *
     * @param target for modal panel
     * @param msg to log and display user info
     */
    protected void logIt(AjaxRequestTarget target, String msg)
    {
        info( msg );
        LOG.info( msg );
        target.appendJavaScript(";alert('" + msg + "');");
    }

    protected static final Logger LOG = Logger.getLogger( WicketSampleBasePage.class.getName() );
}