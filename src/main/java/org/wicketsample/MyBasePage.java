/*
 * This is free and unencumbered software released into the public domain.
 */
package org.wicketsample;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;

/**
 * Base class for MyFortressProject.
 *
 * @author Shawn McKinney
 * @version $Rev$
 */
public abstract class MyBasePage extends WebPage
{
/*
    // TODO: uncomment for fortress spring bean injection:
    @SpringBean
    private AccessMgr accessMgr;
    @SpringBean
    private J2eePolicyMgr j2eePolicyMgr;
*/

    private static final Logger LOG = Logger.getLogger( MyBasePage.class.getName() );

    public MyBasePage()
    {
        BookmarkablePageLink page1Link = new BookmarkablePageLink( "page1.link", Page1.class );
        //FtBookmarkablePageLink page1Link = new FtBookmarkablePageLink( "page1.link", Page1.class );
        add( page1Link );
        BookmarkablePageLink page2Link = new BookmarkablePageLink( "page2.link", Page2.class );
        //FtBookmarkablePageLink page2Link = new FtBookmarkablePageLink( "page2.link", Page2.class );
        add( page2Link );
        BookmarkablePageLink page3Link = new BookmarkablePageLink( "page3.link", Page3.class );
        //FtBookmarkablePageLink page3Link = new FtBookmarkablePageLink( "page3.link", Page3.class );
        add( page3Link );
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

        // TODO: uncomment to enable fortress startup:
        //SecUtils.enableFortress( this, ( HttpServletRequest ) getRequest().getContainerRequest(), j2eePolicyMgr, accessMgr );
    }
}