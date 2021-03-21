package attachments

import attachments.Attachment
import attachments.Page

class PageAttachment(
    id: Int,
    groupId: Int,
    creatorId: Int,
    title: String,
    currentUserCanEdit: Boolean,
    currentUserCanEditAccess: Boolean,
    whoCanView: Int,
    edited: Int,
    created: Int,
    editorId: Int,
    views: Int,
    parent: String,
    parent2: String,
    source: String,
    html: String,
    viewUrl: String,
    override val type: String = "attachments.Page",
    override val objectType: Page = Page(
        id,
        groupId,
        creatorId,
        title,
        currentUserCanEdit,
        currentUserCanEditAccess,
        whoCanView,
        edited,
        created,
        editorId,
        views,
        parent,
        parent2,
        source,
        html,
        viewUrl
    )
) : Attachment {
}