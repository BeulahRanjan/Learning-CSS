## CSS Anchor Positioning

To associate an element with an anchor, you need to first declare which element is the anchor, and then specify which positioned element(s) to associate with that anchor. This creates an anchor reference between the two. This association can be created explicitly via CSS or implicitly.
Converting an element to an anchor-positioned element requires two steps: It needs to be absolutely or fixed positioned using the position property. The positioned element then has its position-anchor property set to the value of the anchor element's anchor-name property to associate the two together.

Used to position one element relative to another (like tooltips & dropdowns)

- Anchor element → reference element (button, input)
- Anchor-positioned element → element attached to anchor
- Position & size are based on anchor’s location
- Browser can auto-change position if element goes offscreen


If you wish to remove an explicit anchor association previously made between an anchor element and a positioned element, you can do one of the following:

Set the anchor's anchor-name property value to none, or to a different <dashed-ident>, if you want a different element to be anchored to it.
Set the position-anchor property of the positioned element to none, or to an anchor name that doesn't exist in the current document, such as --not-an-anchor-name.

Anchor-positioned elements can only bind to anchors inside the same scoped area.
For example, if a document contains multiple repeated components, each with a positioned element tethered to an anchor, all the positioned elements will be anchored to the last anchor on the page unless each component uses a different anchor name. This is likely not the desired behavior.

The anchor-scope property can fix this problem by limiting the visibility, or "scope", of an anchor-name value to a specific subtree. The result is that each positioned element can only be anchored to an element within the same subtree of the element that has the scope set on it.

anchor-scope: all sets the scope so that any anchor-name values set in the subtree can only be bound to by positioned elements in the same subtree.
anchor-scope: --my-anchor, --my-anchor2 sets the scope so that the specified anchor-name values, when set in the subtree, can only be bound to by positioned elements in the same subtree.
anchor-scope: none is the default value; it specifies that no anchor scoping is set.
