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