(function(){var k,aa="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},ba;
if("function"==typeof Object.setPrototypeOf)ba=Object.setPrototypeOf;else{var ca;a:{var da={cb:!0},ea={};try{ea.__proto__=da;ca=ea.cb;break a}catch(a){}ca=!1}ba=ca?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}
for(var fa=ba,ha="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){a!=Array.prototype&&a!=Object.prototype&&(a[b]=c.value)},ia="undefined"!=typeof window&&window===this?this:"undefined"!=typeof global&&null!=global?global:this,ja=function(){function a(){function a(){}
Reflect.construct(a,[],function(){});
return new a instanceof a}
if("undefined"!=typeof Reflect&&Reflect.construct){if(a())return Reflect.construct;var b=Reflect.construct;return function(a,d,e){a=b(a,d);e&&Reflect.setPrototypeOf(a,e.prototype);return a}}return function(a,b,e){void 0===e&&(e=a);
e=aa(e.prototype||Object.prototype);return Function.prototype.apply.call(a,e,b)||e}}(),ka=ia,ma=["Reflect",
"construct"],na=0;na<ma.length-1;na++){var oa=ma[na];oa in ka||(ka[oa]={});ka=ka[oa]}var pa=ma[ma.length-1];ja!=ka[pa]&&null!=ja&&ha(ka,pa,{configurable:!0,writable:!0,value:ja});var m=this;function qa(a){return void 0!==a}
function p(a){return"string"==typeof a}
function ra(a){return"number"==typeof a}
function r(a){a=a.split(".");for(var b=m,c=0;c<a.length;c++)if(b=b[a[c]],null==b)return null;return b}
function sa(){}
function ta(a){a.aa=void 0;a.v=function(){return a.aa?a.aa:a.aa=new a}}
function ua(a){var b=typeof a;if("object"==b)if(a){if(a instanceof Array)return"array";if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if("[object Window]"==c)return"object";if("[object Array]"==c||"number"==typeof a.length&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("splice"))return"array";if("[object Function]"==c||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable("call"))return"function"}else return"null";
else if("function"==b&&"undefined"==typeof a.call)return"object";return b}
function va(a){var b=ua(a);return"array"==b||"object"==b&&"number"==typeof a.length}
function wa(a){return"function"==ua(a)}
function xa(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
function ya(a){return a[za]||(a[za]=++Aa)}
var za="closure_uid_"+(1E9*Math.random()>>>0),Aa=0;function Ba(a,b,c){return a.call.apply(a.bind,arguments)}
function Ca(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var c=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arguments)}}
function u(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?u=Ba:u=Ca;return u.apply(null,arguments)}
function Da(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}}
var Ea=Date.now||function(){return+new Date};
function v(a,b){var c=a.split("."),d=m;c[0]in d||!d.execScript||d.execScript("var "+c[0]);for(var e;c.length&&(e=c.shift());)!c.length&&qa(b)?d[e]=b:d[e]&&d[e]!==Object.prototype[e]?d=d[e]:d=d[e]={}}
function x(a,b){function c(){}
c.prototype=b.prototype;a.A=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.Pb=function(a,c,f){for(var d=Array(arguments.length-2),e=2;e<arguments.length;e++)d[e-2]=arguments[e];return b.prototype[c].apply(a,d)}}
;function Fa(a){if(Error.captureStackTrace)Error.captureStackTrace(this,Fa);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))}
x(Fa,Error);Fa.prototype.name="CustomError";var Ga;var Ha=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if(p(a))return p(b)&&1==b.length?a.indexOf(b,0):-1;
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},z=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=p(a)?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},Ia=Array.prototype.filter?function(a,b,c){return Array.prototype.filter.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=[],f=0,g=p(a)?a.split(""):a,h=0;h<d;h++)if(h in g){var l=g[h];
b.call(c,l,h,a)&&(e[f++]=l)}return e},Ja=Array.prototype.map?function(a,b){return Array.prototype.map.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=Array(c),e=p(a)?a.split(""):a,f=0;f<c;f++)f in e&&(d[f]=b.call(void 0,e[f],f,a));
return d},Ka=Array.prototype.some?function(a,b){return Array.prototype.some.call(a,b,void 0)}:function(a,b){for(var c=a.length,d=p(a)?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a))return!0;
return!1};
function La(a,b){a:{var c=a.length;for(var d=p(a)?a.split(""):a,e=0;e<c;e++)if(e in d&&b.call(void 0,d[e],e,a)){c=e;break a}c=-1}return 0>c?null:p(a)?a.charAt(c):a[c]}
function Ma(a,b){return 0<=Ha(a,b)}
function Na(a){return Array.prototype.concat.apply([],arguments)}
function Oa(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return c}return[]}
function Pa(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(va(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
function Qa(a,b,c,d){return Array.prototype.splice.apply(a,Ra(arguments,1))}
function Ra(a,b,c){return 2>=arguments.length?Array.prototype.slice.call(a,b):Array.prototype.slice.call(a,b,c)}
function Sa(a){for(var b=[],c=0;c<arguments.length;c++){var d=arguments[c];if("array"==ua(d))for(var e=0;e<d.length;e+=8192)for(var f=Sa.apply(null,Ra(d,e,e+8192)),g=0;g<f.length;g++)b.push(f[g]);else b.push(d)}return b}
;var Ta=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]},Ua=String.prototype.repeat?function(a,b){return a.repeat(b)}:function(a,b){return Array(b+1).join(a)};
function Va(a){a=qa(void 0)?a.toFixed(void 0):String(a);var b=a.indexOf(".");-1==b&&(b=a.length);return Ua("0",Math.max(0,2-b))+a}
function Wa(a,b){for(var c=0,d=Ta(String(a)).split("."),e=Ta(String(b)).split("."),f=Math.max(d.length,e.length),g=0;0==c&&g<f;g++){var h=d[g]||"",l=e[g]||"";do{h=/(\d*)(\D*)(.*)/.exec(h)||["","","",""];l=/(\d*)(\D*)(.*)/.exec(l)||["","","",""];if(0==h[0].length&&0==l[0].length)break;c=Xa(0==h[1].length?0:parseInt(h[1],10),0==l[1].length?0:parseInt(l[1],10))||Xa(0==h[2].length,0==l[2].length)||Xa(h[2],l[2]);h=h[3];l=l[3]}while(0==c)}return c}
function Xa(a,b){return a<b?-1:a>b?1:0}
function Ya(a){return String(a).replace(/\-([a-z])/g,function(a,c){return c.toUpperCase()})}
function Za(a){var b=p(void 0)?"undefined".replace(/([-()\[\]{}+?*.$\^|,:#<!\\])/g,"\\$1").replace(/\x08/g,"\\x08"):"\\s";return a.replace(new RegExp("(^"+(b?"|["+b+"]+":"")+")([a-z])","g"),function(a,b,e){return b+e.toUpperCase()})}
;var $a;a:{var ab=m.navigator;if(ab){var bb=ab.userAgent;if(bb){$a=bb;break a}}$a=""}function A(a){return-1!=$a.indexOf(a)}
;function cb(a,b,c){for(var d in a)b.call(c,a[d],d,a)}
function db(a){var b=[],c=0,d;for(d in a)b[c++]=a[d];return b}
function eb(a){var b=fb,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
var gb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function hb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<gb.length;f++)c=gb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;function ib(){return A("Safari")&&!(jb()||A("Coast")||A("Opera")||A("Edge")||A("Silk")||A("Android"))}
function jb(){return(A("Chrome")||A("CriOS"))&&!A("Edge")}
function kb(){return A("Android")&&!(jb()||A("Firefox")||A("Opera")||A("Silk"))}
;function lb(){return A("iPhone")&&!A("iPod")&&!A("iPad")}
function mb(){return lb()||A("iPad")||A("iPod")}
;function nb(a){nb[" "](a);return a}
nb[" "]=sa;function ob(a,b){var c=pb;return Object.prototype.hasOwnProperty.call(c,a)?c[a]:c[a]=b(a)}
;var qb=A("Opera"),B=A("Trident")||A("MSIE"),rb=A("Edge"),sb=rb||B,tb=A("Gecko")&&!(-1!=$a.toLowerCase().indexOf("webkit")&&!A("Edge"))&&!(A("Trident")||A("MSIE"))&&!A("Edge"),ub=-1!=$a.toLowerCase().indexOf("webkit")&&!A("Edge"),vb=A("Macintosh"),wb=A("Windows"),xb=A("Android"),yb=lb(),zb=A("iPad"),Ab=A("iPod"),Bb=mb();function Cb(){var a=m.document;return a?a.documentMode:void 0}
var Db;a:{var Eb="",Fb=function(){var a=$a;if(tb)return/rv:([^\);]+)(\)|;)/.exec(a);if(rb)return/Edge\/([\d\.]+)/.exec(a);if(B)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(ub)return/WebKit\/(\S+)/.exec(a);if(qb)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
Fb&&(Eb=Fb?Fb[1]:"");if(B){var Gb=Cb();if(null!=Gb&&Gb>parseFloat(Eb)){Db=String(Gb);break a}}Db=Eb}var Hb=Db,pb={};function Ib(a){return ob(a,function(){return 0<=Wa(Hb,a)})}
var Jb;var Kb=m.document;Jb=Kb&&B?Cb()||("CSS1Compat"==Kb.compatMode?parseInt(Hb,10):5):void 0;var Lb=!tb&&!B||B&&9<=Number(Jb)||tb&&Ib("1.9.1"),Mb=B&&!Ib("9");function Nb(){this.b="";this.f=Ob}
Nb.prototype.Z=!0;Nb.prototype.Y=function(){return this.b};
var Pb=/^(?:(?:https?|mailto|ftp):|[^:/?#]*(?:[/?#]|$))/i,Ob={};function Qb(a){var b=new Nb;b.b=a;return b}
Qb("about:blank");function Rb(){this.b="";this.f=Sb}
Rb.prototype.Z=!0;Rb.prototype.Y=function(){return this.b};
function Tb(a){if(a instanceof Rb&&a.constructor===Rb&&a.f===Sb)return a.b;ua(a);return"type_error:SafeHtml"}
var Sb={};function Ub(a){var b=new Rb;b.b=a;return b}
Ub("<!DOCTYPE html>");Ub("");Ub("<br>");function C(a,b){this.x=qa(a)?a:0;this.y=qa(b)?b:0}
C.prototype.equals=function(a){return a instanceof C&&(this==a?!0:this&&a?this.x==a.x&&this.y==a.y:!1)};
function Vb(a,b){return new C(a.x-b.x,a.y-b.y)}
C.prototype.ceil=function(){this.x=Math.ceil(this.x);this.y=Math.ceil(this.y);return this};
C.prototype.floor=function(){this.x=Math.floor(this.x);this.y=Math.floor(this.y);return this};
C.prototype.round=function(){this.x=Math.round(this.x);this.y=Math.round(this.y);return this};function Wb(a,b){this.width=a;this.height=b}
k=Wb.prototype;k.fb=function(){return this.width*this.height};
k.aspectRatio=function(){return this.width/this.height};
k.isEmpty=function(){return!this.fb()};
k.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
k.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
k.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};function Xb(a){return a?new Yb(Zb(a)):Ga||(Ga=new Yb)}
function D(a){return p(a)?document.getElementById(a):a}
function $b(a,b){var c=b||document;return c.querySelectorAll&&c.querySelector?c.querySelectorAll("."+a):ac(document,"*",a,b)}
function E(a,b){var c=b||document;if(c.getElementsByClassName)c=c.getElementsByClassName(a)[0];else{c=document;var d=b||c;c=d.querySelectorAll&&d.querySelector&&a?d.querySelector(""+(a?"."+a:"")):ac(c,"*",a,b)[0]||null}return c||null}
function ac(a,b,c,d){a=d||a;b=b&&"*"!=b?String(b).toUpperCase():"";if(a.querySelectorAll&&a.querySelector&&(b||c))return a.querySelectorAll(b+(c?"."+c:""));if(c&&a.getElementsByClassName){a=a.getElementsByClassName(c);if(b){d={};for(var e=0,f=0,g;g=a[f];f++)b==g.nodeName&&(d[e++]=g);d.length=e;return d}return a}a=a.getElementsByTagName(b||"*");if(c){d={};for(f=e=0;g=a[f];f++)b=g.className,"function"==typeof b.split&&Ma(b.split(/\s+/),c)&&(d[e++]=g);d.length=e;return d}return a}
function bc(a,b){cb(b,function(b,d){b&&b.Z&&(b=b.Y());"style"==d?a.style.cssText=b:"class"==d?a.className=b:"for"==d?a.htmlFor=b:cc.hasOwnProperty(d)?a.setAttribute(cc[d],b):0==d.lastIndexOf("aria-",0)||0==d.lastIndexOf("data-",0)?a.setAttribute(d,b):a[d]=b})}
var cc={cellpadding:"cellPadding",cellspacing:"cellSpacing",colspan:"colSpan",frameborder:"frameBorder",height:"height",maxlength:"maxLength",nonce:"nonce",role:"role",rowspan:"rowSpan",type:"type",usemap:"useMap",valign:"vAlign",width:"width"};function dc(a){a=a.document;a=ec(a)?a.documentElement:a.body;return new Wb(a.clientWidth,a.clientHeight)}
function fc(a){var b=gc(a);a=hc(a);return B&&Ib("10")&&a.pageYOffset!=b.scrollTop?new C(b.scrollLeft,b.scrollTop):new C(a.pageXOffset||b.scrollLeft,a.pageYOffset||b.scrollTop)}
function gc(a){return a.scrollingElement?a.scrollingElement:!ub&&ec(a)?a.documentElement:a.body||a.documentElement}
function hc(a){return a.parentWindow||a.defaultView}
function ec(a){return"CSS1Compat"==a.compatMode}
function ic(a){a&&a.parentNode&&a.parentNode.removeChild(a)}
function jc(a){return Lb&&void 0!=a.children?a.children:Ia(a.childNodes,function(a){return 1==a.nodeType})}
function kc(a){return xa(a)&&1==a.nodeType}
function lc(a,b){if(!a||!b)return!1;if(a.contains&&1==b.nodeType)return a==b||a.contains(b);if("undefined"!=typeof a.compareDocumentPosition)return a==b||!!(a.compareDocumentPosition(b)&16);for(;b&&a!=b;)b=b.parentNode;return b==a}
function Zb(a){return 9==a.nodeType?a:a.ownerDocument||a.document}
function mc(a,b){if("textContent"in a)a.textContent=b;else if(3==a.nodeType)a.data=String(b);else if(a.firstChild&&3==a.firstChild.nodeType){for(;a.lastChild!=a.firstChild;)a.removeChild(a.lastChild);a.firstChild.data=String(b)}else{for(var c;c=a.firstChild;)a.removeChild(c);a.appendChild(Zb(a).createTextNode(String(b)))}}
function nc(a,b){var c=[];return oc(a,b,c,!0)?c[0]:void 0}
function oc(a,b,c,d){if(null!=a)for(a=a.firstChild;a;){if(b(a)&&(c.push(a),d)||oc(a,b,c,d))return!0;a=a.nextSibling}return!1}
var pc={SCRIPT:1,STYLE:1,HEAD:1,IFRAME:1,OBJECT:1},qc={IMG:" ",BR:"\n"};function rc(a){var b;if((b="A"==a.tagName||"INPUT"==a.tagName||"TEXTAREA"==a.tagName||"SELECT"==a.tagName||"BUTTON"==a.tagName?!a.disabled&&(!sc(a)||tc(a)):sc(a)&&tc(a))&&B){var c;!wa(a.getBoundingClientRect)||B&&null==a.parentElement?c={height:a.offsetHeight,width:a.offsetWidth}:c=a.getBoundingClientRect();a=null!=c&&0<c.height&&0<c.width}else a=b;return a}
function sc(a){return B&&!Ib("9")?(a=a.getAttributeNode("tabindex"),null!=a&&a.specified):a.hasAttribute("tabindex")}
function tc(a){a=a.tabIndex;return ra(a)&&0<=a&&32768>a}
function vc(a){if(Mb&&null!==a&&"innerText"in a)a=a.innerText.replace(/(\r\n|\r|\n)/g,"\n");else{var b=[];wc(a,b,!0);a=b.join("")}a=a.replace(/ \xAD /g," ").replace(/\xAD/g,"");a=a.replace(/\u200B/g,"");Mb||(a=a.replace(/ +/g," "));" "!=a&&(a=a.replace(/^\s*/,""));return a}
function wc(a,b,c){if(!(a.nodeName in pc))if(3==a.nodeType)c?b.push(String(a.nodeValue).replace(/(\r\n|\r|\n)/g,"")):b.push(a.nodeValue);else if(a.nodeName in qc)b.push(qc[a.nodeName]);else for(a=a.firstChild;a;)wc(a,b,c),a=a.nextSibling}
function xc(a,b,c,d){if(!b&&!c)return null;var e=b?String(b).toUpperCase():null;return yc(a,function(a){return(!e||a.nodeName==e)&&(!c||p(a.className)&&Ma(a.className.split(/\s+/),c))},!0,d)}
function F(a,b){return xc(a,null,b,void 0)}
function yc(a,b,c,d){a&&!c&&(a=a.parentNode);for(c=0;a&&(null==d||c<=d);){if(b(a))return a;a=a.parentNode;c++}return null}
function Yb(a){this.b=a||m.document||document}
Yb.prototype.getElementsByTagName=function(a,b){return(b||this.b).getElementsByTagName(String(a))};
Yb.prototype.createElement=function(a){return this.b.createElement(String(a))};
Yb.prototype.appendChild=function(a,b){a.appendChild(b)};
Yb.prototype.isElement=kc;/*
 gapi.loader.OBJECT_CREATE_TEST_OVERRIDE &&*/
var zc=window,Ac=document,Bc=zc.location;function Cc(){}
var Dc=/\[native code\]/;function G(a,b,c){return a[b]=a[b]||c}
function Ec(a){a=a.sort();for(var b=[],c=void 0,d=0;d<a.length;d++){var e=a[d];e!=c&&b.push(e);c=e}return b}
function Fc(){var a;if((a=Object.create)&&Dc.test(a))a=a(null);else{a={};for(var b in a)a[b]=void 0}return a}
var Gc=G(zc,"gapi",{});var H;H=G(zc,"___jsl",Fc());G(H,"I",0);G(H,"hel",10);function Hc(){var a=Bc.href;if(H.dpo)var b=H.h;else{b=H.h;var c=RegExp("([#].*&|[#])jsh=([^&#]*)","g"),d=RegExp("([?#].*&|[?#])jsh=([^&#]*)","g");if(a=a&&(c.exec(a)||d.exec(a)))try{b=decodeURIComponent(a[2])}catch(e){}}return b}
function Ic(a){var b=G(H,"PQ",[]);H.PQ=[];var c=b.length;if(0===c)a();else for(var d=0,e=function(){++d===c&&a()},f=0;f<c;f++)b[f](e)}
function Jc(a){return G(G(H,"H",Fc()),a,Fc())}
;var Kc=G(H,"perf",Fc());G(Kc,"g",Fc());var Lc=G(Kc,"i",Fc());G(Kc,"r",[]);Fc();Fc();function Mc(a,b,c){b&&0<b.length&&(b=Nc(b),c&&0<c.length&&(b+="___"+Nc(c)),28<b.length&&(b=b.substr(0,28)+(b.length-28)),c=b,b=G(Lc,"_p",Fc()),G(b,c,Fc())[a]=(new Date).getTime(),b=Kc.r,"function"===typeof b?b(a,"_p",c):b.push([a,"_p",c]))}
function Nc(a){return a.join("__").replace(/\./g,"_").replace(/\-/g,"_").replace(/,/g,"_")}
;var Oc=Fc(),Pc=[];function Qc(a){throw Error("Bad hint"+(a?": "+a:""));}
Pc.push(["jsl",function(a){for(var b in a)if(Object.prototype.hasOwnProperty.call(a,b)){var c=a[b];"object"==typeof c?H[b]=G(H,b,[]).concat(c):G(H,b,c)}if(b=a.u)a=G(H,"us",[]),a.push(b),(b=/^https:(.*)$/.exec(b))&&a.push("http:"+b[1])}]);
var Rc=/^(\/[a-zA-Z0-9_\-]+)+$/,Sc=[/\/amp\//,/\/amp$/,/^\/amp$/],Tc=/^[a-zA-Z0-9\-_\.,!]+$/,Uc=/^gapi\.loaded_[0-9]+$/,Vc=/^[a-zA-Z0-9,._-]+$/;function Wc(a,b,c,d){var e=a.split(";"),f=e.shift(),g=Oc[f],h=null;g?h=g(e,b,c,d):Qc("no hint processor for: "+f);h||Qc("failed to generate load url");b=h;c=b.match(Xc);(d=b.match(Yc))&&1===d.length&&Zc.test(b)&&c&&1===c.length||Qc("failed sanity: "+a);return h}
function $c(a,b,c,d){function e(a){return encodeURIComponent(a).replace(/%2C/g,",")}
a=ad(a);Uc.test(c)||Qc("invalid_callback");b=bd(b);d=d&&d.length?bd(d):null;return[encodeURIComponent(a.pathPrefix).replace(/%2C/g,",").replace(/%2F/g,"/"),"/k=",e(a.version),"/m=",e(b),d?"/exm="+e(d):"","/rt=j/sv=1/d=1/ed=1",a.ja?"/am="+e(a.ja):"",a.Da?"/rs="+e(a.Da):"",a.Na?"/t="+e(a.Na):"","/cb=",e(c)].join("")}
function ad(a){"/"!==a.charAt(0)&&Qc("relative path");for(var b=a.substring(1).split("/"),c=[];b.length;){a=b.shift();if(!a.length||0==a.indexOf("."))Qc("empty/relative directory");else if(0<a.indexOf("=")){b.unshift(a);break}c.push(a)}a={};for(var d=0,e=b.length;d<e;++d){var f=b[d].split("="),g=decodeURIComponent(f[0]),h=decodeURIComponent(f[1]);2==f.length&&g&&h&&(a[g]=a[g]||h)}b="/"+c.join("/");Rc.test(b)||Qc("invalid_prefix");c=0;for(d=Sc.length;c<d;++c)Sc[c].test(b)&&Qc("invalid_prefix");c=cd(a,
"k",!0);d=cd(a,"am");e=cd(a,"rs");a=cd(a,"t");return{pathPrefix:b,version:c,ja:d,Da:e,Na:a}}
function bd(a){for(var b=[],c=0,d=a.length;c<d;++c){var e=a[c].replace(/\./g,"_").replace(/-/g,"_");Vc.test(e)&&b.push(e)}return b.join(",")}
function cd(a,b,c){a=a[b];!a&&c&&Qc("missing: "+b);if(a){if(Tc.test(a))return a;Qc("invalid: "+b)}return null}
var Zc=/^https?:\/\/[a-z0-9_.-]+\.google(rs)?\.com(:\d+)?\/[a-zA-Z0-9_.,!=\-\/]+$/,Yc=/\/cb=/g,Xc=/\/\//g;function dd(){var a=Hc();if(!a)throw Error("Bad hint");return a}
Oc.m=function(a,b,c,d){(a=a[0])||Qc("missing_hint");return"https://apis.google.com"+$c(a,b,c,d)};
var ed=decodeURI("%73cript"),fd=/^[-+_0-9\/A-Za-z]+={0,2}$/;function gd(a,b){for(var c=[],d=0;d<a.length;++d){var e=a[d],f;if(f=e){a:{for(f=0;f<b.length;f++)if(b[f]===e)break a;f=-1}f=0>f}f&&c.push(e)}return c}
function hd(){var a=H.nonce;if(void 0!==a)return a&&a===String(a)&&a.match(fd)?a:H.nonce=null;var b=G(H,"us",[]);if(!b||!b.length)return H.nonce=null;for(var c=Ac.getElementsByTagName(ed),d=0,e=c.length;d<e;++d){var f=c[d];if(f.src&&(a=String(f.nonce||f.getAttribute("nonce")||"")||null)){for(var g=0,h=b.length;g<h&&b[g]!==f.src;++g);if(g!==h&&a&&a===String(a)&&a.match(fd))return H.nonce=a}}return null}
function id(a){if("loading"!=Ac.readyState)jd(a);else{var b=hd(),c="";null!==b&&(c=' nonce="'+b+'"');Ac.write("<"+ed+' src="'+encodeURI(a)+'"'+c+"></"+ed+">")}}
function jd(a){var b=Ac.createElement(ed);b.setAttribute("src",a);a=hd();null!==a&&b.setAttribute("nonce",a);b.async="true";(a=Ac.getElementsByTagName(ed)[0])?a.parentNode.insertBefore(b,a):(Ac.head||Ac.body||Ac.documentElement).appendChild(b)}
function kd(a,b){var c=b&&b._c;if(c)for(var d=0;d<Pc.length;d++){var e=Pc[d][0],f=Pc[d][1];f&&Object.prototype.hasOwnProperty.call(c,e)&&f(c[e],a,b)}}
function ld(a,b,c){md(function(){var c=b===Hc()?G(Gc,"_",Fc()):Fc();c=G(Jc(b),"_",c);a(c)},c)}
function nd(a,b){var c=b||{};"function"==typeof b&&(c={},c.callback=b);kd(a,c);var d=a?a.split(":"):[],e=c.h||dd(),f=G(H,"ah",Fc());if(f["::"]&&d.length){for(var g=[],h=null;h=d.shift();){var l=h.split(".");l=f[h]||f[l[1]&&"ns:"+l[0]||""]||e;var n=g.length&&g[g.length-1]||null,t=n;n&&n.hint==l||(t={hint:l,features:[]},g.push(t));t.features.push(h)}var y=g.length;if(1<y){var q=c.callback;q&&(c.callback=function(){0==--y&&q()})}for(;d=g.shift();)od(d.features,c,d.hint)}else od(d||[],c,e)}
function od(a,b,c){function d(a,b){if(y)return 0;zc.clearTimeout(t);q.push.apply(q,w);var d=((Gc||{}).config||{}).update;d?d(f):f&&G(H,"cu",[]).push(f);if(b){Mc("me0",a,I);try{ld(b,c,n)}finally{Mc("me1",a,I)}}return 1}
a=Ec(a)||[];var e=b.callback,f=b.config,g=b.timeout,h=b.ontimeout,l=b.onerror,n=void 0;"function"==typeof l&&(n=l);var t=null,y=!1;if(g&&!h||!g&&h)throw"Timeout requires both the timeout parameter and ontimeout parameter to be set";l=G(Jc(c),"r",[]).sort();var q=G(Jc(c),"L",[]).sort(),I=[].concat(l);0<g&&(t=zc.setTimeout(function(){y=!0;h()},g));
var w=gd(a,q);if(w.length){w=gd(a,l);var la=G(H,"CP",[]),S=la.length;la[S]=function(a){function b(){var a=la[S+1];a&&a()}
function c(b){la[S]=null;d(w,a)&&Ic(function(){e&&e();b()})}
if(!a)return 0;Mc("ml1",w,I);0<S&&la[S-1]?la[S]=function(){c(b)}:c(b)};
if(w.length){var uc="loaded_"+H.I++;Gc[uc]=function(a){la[S](a);Gc[uc]=null};
a=Wc(c,w,"gapi."+uc,l);l.push.apply(l,w);Mc("ml0",w,I);b.sync||zc.___gapisync?id(a):jd(a)}else la[S](Cc)}else d(w)&&e&&e()}
function md(a,b){if(H.hee&&0<H.hel)try{return a()}catch(c){b&&b(c),H.hel--,nd("debug_error",function(){try{window.___jsl.hefn(c)}catch(d){throw c;}})}else try{return a()}catch(c){throw b&&b(c),c;
}}
Gc.load=function(a,b){return md(function(){return nd(a,b)})};function pd(a,b){this.i=a;this.j=b;this.f=0;this.b=null}
pd.prototype.get=function(){if(0<this.f){this.f--;var a=this.b;this.b=a.next;a.next=null}else a=this.i();return a};
function qd(a,b){a.j(b);100>a.f&&(a.f++,b.next=a.b,a.b=b)}
;function rd(a){m.setTimeout(function(){throw a;},0)}
var sd;
function td(){var a=m.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!A("Presto")&&(a=function(){var a=document.createElement("IFRAME");a.style.display="none";a.src="";document.documentElement.appendChild(a);var b=a.contentWindow;a=b.document;a.open();a.write("");a.close();var c="callImmediate"+Math.random(),d="file:"==b.location.protocol?"*":b.location.protocol+"//"+b.location.host;a=u(function(a){if(("*"==d||a.origin==d)&&a.data==
c)this.port1.onmessage()},this);
b.addEventListener("message",a,!1);this.port1={};this.port2={postMessage:function(){b.postMessage(c,d)}}});
if("undefined"!==typeof a&&!A("Trident")&&!A("MSIE")){var b=new a,c={},d=c;b.port1.onmessage=function(){if(qa(c.next)){c=c.next;var a=c.la;c.la=null;a()}};
return function(a){d.next={la:a};d=d.next;b.port2.postMessage(0)}}return"undefined"!==typeof document&&"onreadystatechange"in document.createElement("SCRIPT")?function(a){var b=document.createElement("SCRIPT");
b.onreadystatechange=function(){b.onreadystatechange=null;b.parentNode.removeChild(b);b=null;a();a=null};
document.documentElement.appendChild(b)}:function(a){m.setTimeout(a,0)}}
;function ud(){this.f=this.b=null}
var wd=new pd(function(){return new vd},function(a){a.reset()});
ud.prototype.add=function(a,b){var c=wd.get();c.set(a,b);this.f?this.f.next=c:this.b=c;this.f=c};
ud.prototype.remove=function(){var a=null;this.b&&(a=this.b,this.b=this.b.next,this.b||(this.f=null),a.next=null);return a};
function vd(){this.next=this.scope=this.b=null}
vd.prototype.set=function(a,b){this.b=a;this.scope=b;this.next=null};
vd.prototype.reset=function(){this.next=this.scope=this.b=null};function xd(a,b){yd||zd();Ad||(yd(),Ad=!0);Bd.add(a,b)}
var yd;function zd(){if(-1!=String(m.Promise).indexOf("[native code]")){var a=m.Promise.resolve(void 0);yd=function(){a.then(Cd)}}else yd=function(){var a=Cd;
!wa(m.setImmediate)||m.Window&&m.Window.prototype&&!A("Edge")&&m.Window.prototype.setImmediate==m.setImmediate?(sd||(sd=td()),sd(a)):m.setImmediate(a)}}
var Ad=!1,Bd=new ud;function Cd(){for(var a;a=Bd.remove();){try{a.b.call(a.scope)}catch(b){rd(b)}qd(wd,a)}Ad=!1}
;function Dd(a,b,c){ra(a)?(this.date=Ed(a,b||0,c||1),Fd(this,c||1)):xa(a)?(this.date=Ed(a.getFullYear(),a.getMonth(),a.getDate()),Fd(this,a.getDate())):(this.date=new Date(Ea()),a=this.date.getDate(),this.date.setHours(0),this.date.setMinutes(0),this.date.setSeconds(0),this.date.setMilliseconds(0),Fd(this,a))}
function Ed(a,b,c){b=new Date(a,b,c);0<=a&&100>a&&b.setFullYear(b.getFullYear()-1900);return b}
k=Dd.prototype;k.getFullYear=function(){return this.date.getFullYear()};
k.getMonth=function(){return this.date.getMonth()};
k.getDate=function(){return this.date.getDate()};
k.getTime=function(){return this.date.getTime()};
k.set=function(a){this.date=new Date(a.getFullYear(),a.getMonth(),a.getDate())};
k.add=function(a){if(a.i||a.f){var b=this.getMonth()+a.f+12*a.i,c=this.getFullYear()+Math.floor(b/12);b%=12;0>b&&(b+=12);a:{switch(b){case 1:var d=0!=c%4||0==c%100&&0!=c%400?28:29;break a;case 5:case 8:case 10:case 3:d=30;break a}d=31}d=Math.min(d,this.getDate());this.date.setDate(1);this.date.setFullYear(c);this.date.setMonth(b);this.date.setDate(d)}a.days&&(a=new Date((new Date(this.getFullYear(),this.getMonth(),this.getDate(),12)).getTime()+864E5*a.days),this.date.setDate(1),this.date.setFullYear(a.getFullYear()),
this.date.setMonth(a.getMonth()),this.date.setDate(a.getDate()),Fd(this,a.getDate()))};
k.U=function(a){return[this.getFullYear(),Va(this.getMonth()+1),Va(this.getDate())].join(a?"-":"")+""};
k.equals=function(a){return!(!a||this.getFullYear()!=a.getFullYear()||this.getMonth()!=a.getMonth()||this.getDate()!=a.getDate())};
k.toString=function(){return this.U()};
function Fd(a,b){a.getDate()!=b&&a.date.setUTCHours(a.date.getUTCHours()+(a.getDate()<b?1:-1))}
k.valueOf=function(){return this.date.valueOf()};
function Gd(a,b,c,d,e,f,g){this.date=ra(a)?new Date(a,b||0,c||1,d||0,e||0,f||0,g||0):new Date(a&&a.getTime?a.getTime():Ea())}
x(Gd,Dd);Gd.prototype.add=function(a){Dd.prototype.add.call(this,a);a.b&&this.date.setUTCHours(this.date.getUTCHours()+a.b);a.minutes&&this.date.setUTCMinutes(this.date.getUTCMinutes()+a.minutes);a.seconds&&this.date.setUTCSeconds(this.date.getUTCSeconds()+a.seconds)};
Gd.prototype.U=function(a){var b=Dd.prototype.U.call(this,a);return a?b+" "+Va(this.date.getHours())+":"+Va(this.date.getMinutes())+":"+Va(this.date.getSeconds())+"":b+"T"+Va(this.date.getHours())+Va(this.date.getMinutes())+Va(this.date.getSeconds())+""};
Gd.prototype.equals=function(a){return this.getTime()==a.getTime()};
Gd.prototype.toString=function(){return this.U()};function Hd(){this.i=this.i;this.j=this.j}
Hd.prototype.i=!1;Hd.prototype.S=function(){return this.i};
Hd.prototype.dispose=function(){this.i||(this.i=!0,this.X())};
Hd.prototype.X=function(){if(this.j)for(;this.j.length;)this.j.shift()()};
function Id(a){a&&"function"==typeof a.dispose&&a.dispose()}
;function Jd(a){if(a.classList)return a.classList;a=a.className;return p(a)&&a.match(/\S+/g)||[]}
function J(a,b){return a.classList?a.classList.contains(b):Ma(Jd(a),b)}
function K(a,b){a.classList?a.classList.add(b):J(a,b)||(a.className+=0<a.className.length?" "+b:b)}
function Kd(a,b){if(a.classList)z(b,function(b){K(a,b)});
else{var c={};z(Jd(a),function(a){c[a]=!0});
z(b,function(a){c[a]=!0});
a.className="";for(var d in c)a.className+=0<a.className.length?" "+d:d}}
function L(a,b){a.classList?a.classList.remove(b):J(a,b)&&(a.className=Ia(Jd(a),function(a){return a!=b}).join(" "))}
function Ld(a,b){a.classList?z(b,function(b){L(a,b)}):a.className=Ia(Jd(a),function(a){return!Ma(b,a)}).join(" ")}
function Md(a,b,c){c?K(a,b):L(a,b)}
function Nd(a,b,c){J(a,b)&&(L(a,b),K(a,c))}
function Od(a,b){var c=!J(a,b);Md(a,b,c)}
;var Pd=A("Firefox"),Qd=lb()||A("iPod"),Rd=A("iPad"),Sd=kb(),Td=jb(),Ud=ib()&&!mb();var Vd=!B&&!ib();function Wd(a,b){if(/-[a-z]/.test(b))return null;if(Vd&&a.dataset){if(kb()&&!(b in a.dataset))return null;var c=a.dataset[b];return void 0===c?null:c}return a.getAttribute("data-"+String(b).replace(/([A-Z])/g,"-$1").toLowerCase())}
;var Xd="StopIteration"in m?m.StopIteration:{message:"StopIteration",stack:""};function Yd(){}
Yd.prototype.next=function(){throw Xd;};
Yd.prototype.P=function(){return this};
function Zd(a){if(a instanceof Yd)return a;if("function"==typeof a.P)return a.P(!1);if(va(a)){var b=0,c=new Yd;c.next=function(){for(;;){if(b>=a.length)throw Xd;if(b in a)return a[b++];b++}};
return c}throw Error("Not implemented");}
function $d(a,b){if(va(a))try{z(a,b,void 0)}catch(c){if(c!==Xd)throw c;}else{a=Zd(a);try{for(;;)b.call(void 0,a.next(),void 0,a)}catch(c){if(c!==Xd)throw c;}}}
function ae(a){if(va(a))return Oa(a);a=Zd(a);var b=[];$d(a,function(a){b.push(a)});
return b}
;function be(a,b,c,d){this.top=a;this.right=b;this.bottom=c;this.left=d}
be.prototype.getHeight=function(){return this.bottom-this.top};
be.prototype.ceil=function(){this.top=Math.ceil(this.top);this.right=Math.ceil(this.right);this.bottom=Math.ceil(this.bottom);this.left=Math.ceil(this.left);return this};
be.prototype.floor=function(){this.top=Math.floor(this.top);this.right=Math.floor(this.right);this.bottom=Math.floor(this.bottom);this.left=Math.floor(this.left);return this};
be.prototype.round=function(){this.top=Math.round(this.top);this.right=Math.round(this.right);this.bottom=Math.round(this.bottom);this.left=Math.round(this.left);return this};function ce(a,b,c,d){this.left=a;this.top=b;this.width=c;this.height=d}
ce.prototype.ceil=function(){this.left=Math.ceil(this.left);this.top=Math.ceil(this.top);this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
ce.prototype.floor=function(){this.left=Math.floor(this.left);this.top=Math.floor(this.top);this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
ce.prototype.round=function(){this.left=Math.round(this.left);this.top=Math.round(this.top);this.width=Math.round(this.width);this.height=Math.round(this.height);return this};function de(a,b,c){if(p(b))(b=ee(a,b))&&(a.style[b]=c);else for(var d in b){c=a;var e=b[d],f=ee(c,d);f&&(c.style[f]=e)}}
var fe={};function ee(a,b){var c=fe[b];if(!c){var d=Ya(b);c=d;void 0===a.style[d]&&(d=(ub?"Webkit":tb?"Moz":B?"ms":qb?"O":null)+Za(d),void 0!==a.style[d]&&(c=d));fe[b]=c}return c}
function ge(a,b){var c=Zb(a);return c.defaultView&&c.defaultView.getComputedStyle&&(c=c.defaultView.getComputedStyle(a,null))?c[b]||c.getPropertyValue(b)||"":""}
function he(a,b){return ge(a,b)||(a.currentStyle?a.currentStyle[b]:null)||a.style&&a.style[b]}
function ie(a){try{var b=a.getBoundingClientRect()}catch(c){return{left:0,top:0,right:0,bottom:0}}B&&a.ownerDocument.body&&(a=a.ownerDocument,b.left-=a.documentElement.clientLeft+a.body.clientLeft,b.top-=a.documentElement.clientTop+a.body.clientTop);return b}
function je(a){if(B&&!(8<=Number(Jb)))return a.offsetParent;var b=Zb(a),c=he(a,"position"),d="fixed"==c||"absolute"==c;for(a=a.parentNode;a&&a!=b;a=a.parentNode)if(11==a.nodeType&&a.host&&(a=a.host),c=he(a,"position"),d=d&&"static"==c&&a!=b.documentElement&&a!=b.body,!d&&(a.scrollWidth>a.clientWidth||a.scrollHeight>a.clientHeight||"fixed"==c||"absolute"==c||"relative"==c))return a;return null}
function ke(a){for(var b=new be(0,Infinity,Infinity,0),c=Xb(a),d=c.b.body,e=c.b.documentElement,f=gc(c.b);a=je(a);)if(!(B&&0==a.clientWidth||ub&&0==a.clientHeight&&a==d)&&a!=d&&a!=e&&"visible"!=he(a,"overflow")){var g=le(a),h=new C(a.clientLeft,a.clientTop);g.x+=h.x;g.y+=h.y;b.top=Math.max(b.top,g.y);b.right=Math.min(b.right,g.x+a.clientWidth);b.bottom=Math.min(b.bottom,g.y+a.clientHeight);b.left=Math.max(b.left,g.x)}d=f.scrollLeft;f=f.scrollTop;b.left=Math.max(b.left,d);b.top=Math.max(b.top,f);c=
dc(hc(c.b)||window);b.right=Math.min(b.right,d+c.width);b.bottom=Math.min(b.bottom,f+c.height);return 0<=b.top&&0<=b.left&&b.bottom>b.top&&b.right>b.left?b:null}
function le(a){var b=Zb(a),c=new C(0,0);var d=b?Zb(b):document;d=!B||9<=Number(Jb)||ec(Xb(d).b)?d.documentElement:d.body;if(a==d)return c;a=ie(a);b=fc(Xb(b).b);c.x=a.left+b.x;c.y=a.top+b.y;return c}
function me(a){a=ie(a);return new C(a.left,a.top)}
function ne(a,b){"number"==typeof a&&(a=(b?Math.round(a):a)+"px");return a}
function oe(a){var b=pe;if("none"!=he(a,"display"))return b(a);var c=a.style,d=c.display,e=c.visibility,f=c.position;c.visibility="hidden";c.position="absolute";c.display="inline";a=b(a);c.display=d;c.position=f;c.visibility=e;return a}
function pe(a){var b=a.offsetWidth,c=a.offsetHeight,d=ub&&!b&&!c;return qa(b)&&!d||!a.getBoundingClientRect?new Wb(b,c):(a=ie(a),new Wb(a.right-a.left,a.bottom-a.top))}
function qe(a){var b=le(a);a=oe(a);return new ce(b.x,b.y,a.width,a.height)}
function re(a){return"rtl"==he(a,"direction")}
function se(a,b){if(/^\d+px?$/.test(b))return parseInt(b,10);var c=a.style.left,d=a.runtimeStyle.left;a.runtimeStyle.left=a.currentStyle.left;a.style.left=b;var e=a.style.pixelLeft;a.style.left=c;a.runtimeStyle.left=d;return+e}
function te(a,b){var c=a.currentStyle?a.currentStyle[b]:null;return c?se(a,c):0}
var ue={thin:2,medium:4,thick:6};function ve(a,b){if("none"==(a.currentStyle?a.currentStyle[b+"Style"]:null))return 0;var c=a.currentStyle?a.currentStyle[b+"Width"]:null;return c in ue?ue[c]:se(a,c)}
;var we=function(){if(wb){var a=/Windows NT ([0-9.]+)/;return(a=a.exec($a))?a[1]:"0"}return vb?(a=/10[_.][0-9_.]+/,(a=a.exec($a))?a[0].replace(/_/g,"."):"10"):xb?(a=/Android\s+([^\);]+)(\)|;)/,(a=a.exec($a))?a[1]:""):yb||zb||Ab?(a=/(?:iPhone|CPU)\s+OS\s+(\S+)/,(a=a.exec($a))?a[1].replace(/_/g,"."):""):""}();function xe(a){return(a=a.exec($a))?a[1]:""}
var ye=function(){if(Pd)return xe(/Firefox\/([0-9.]+)/);if(B||rb||qb)return Hb;if(Td)return mb()?xe(/CriOS\/([0-9.]+)/):xe(/Chrome\/([0-9.]+)/);if(Ud&&!mb())return xe(/Version\/([0-9.]+)/);if(Qd||Rd){var a=/Version\/(\S+).*Mobile\/(\S+)/.exec($a);if(a)return a[1]+"."+a[2]}else if(Sd)return(a=xe(/Android\s+([0-9.]+)/))?a:xe(/Version\/([0-9.]+)/);return""}();function ze(a,b,c,d,e,f,g){var h;if(h=c.offsetParent){var l="HTML"==h.tagName||"BODY"==h.tagName;if(!l||"static"!=he(h,"position")){var n=le(h);if(!l){l=re(h);var t;if(t=l){if(t=Ud)t=0<=Wa(ye,10);var y;if(y=Bb)y=0<=Wa(we,10);t=tb||t||y}l=t?-h.scrollLeft:!l||sb&&Ib("8")||"visible"==he(h,"overflowX")?h.scrollLeft:h.scrollWidth-h.clientWidth-h.scrollLeft;n=Vb(n,new C(l,h.scrollTop))}}}h=n||new C;n=qe(a);if(l=ke(a)){var q=new ce(l.left,l.top,l.right-l.left,l.bottom-l.top);l=Math.max(n.left,q.left);t=
Math.min(n.left+n.width,q.left+q.width);l<=t&&(y=Math.max(n.top,q.top),q=Math.min(n.top+n.height,q.top+q.height),y<=q&&(n.left=l,n.top=y,n.width=t-l,n.height=q-y))}l=Xb(a);y=Xb(c);if(l.b!=y.b){t=l.b.body;y=hc(y.b);q=new C(0,0);var I=(I=Zb(t))?hc(I):window;b:{try{nb(I.parent);var w=!0;break b}catch(uc){}w=!1}if(w){w=t;do{var la=I==y?le(w):me(w);q.x+=la.x;q.y+=la.y}while(I&&I!=y&&I!=I.parent&&(w=I.frameElement)&&(I=I.parent))}w=Vb(q,le(t));!B||9<=Number(Jb)||ec(l.b)||(w=Vb(w,fc(l.b)));n.left+=w.x;n.top+=
w.y}a=Ae(a,b);b=n.left;a&4?b+=n.width:a&2&&(b+=n.width/2);b=new C(b,n.top+(a&1?n.height:0));b=Vb(b,h);e&&(b.x+=(a&4?-1:1)*e.x,b.y+=(a&1?-1:1)*e.y);var S;g&&(S=ke(c))&&(S.top-=h.y,S.right-=h.x,S.bottom-=h.y,S.left-=h.x);return Be(b,c,d,f,S,g,void 0)}
function Be(a,b,c,d,e,f,g){a=new C(a.x,a.y);var h=Ae(b,c);c=oe(b);g=g?new Wb(g.width,g.height):new Wb(c.width,c.height);a=new C(a.x,a.y);g=new Wb(g.width,g.height);var l=0;if(d||0!=h)h&4?a.x-=g.width+(d?d.right:0):h&2?a.x-=g.width/2:d&&(a.x+=d.left),h&1?a.y-=g.height+(d?d.bottom:0):d&&(a.y+=d.top);if(f){if(e){d=a;h=g;l=0;65==(f&65)&&(d.x<e.left||d.x>=e.right)&&(f&=-2);132==(f&132)&&(d.y<e.top||d.y>=e.bottom)&&(f&=-5);d.x<e.left&&f&1&&(d.x=e.left,l|=1);if(f&16){var n=d.x;d.x<e.left&&(d.x=e.left,l|=
4);d.x+h.width>e.right&&(h.width=Math.min(e.right-d.x,n+h.width-e.left),h.width=Math.max(h.width,0),l|=4)}d.x+h.width>e.right&&f&1&&(d.x=Math.max(e.right-h.width,e.left),l|=1);f&2&&(l|=(d.x<e.left?16:0)|(d.x+h.width>e.right?32:0));d.y<e.top&&f&4&&(d.y=e.top,l|=2);f&32&&(n=d.y,d.y<e.top&&(d.y=e.top,l|=8),d.y+h.height>e.bottom&&(h.height=Math.min(e.bottom-d.y,n+h.height-e.top),h.height=Math.max(h.height,0),l|=8));d.y+h.height>e.bottom&&f&4&&(d.y=Math.max(e.bottom-h.height,e.top),l|=2);f&8&&(l|=(d.y<
e.top?64:0)|(d.y+h.height>e.bottom?128:0));e=l}else e=256;l=e}f=new ce(0,0,0,0);f.left=a.x;f.top=a.y;f.width=g.width;f.height=g.height;e=l;if(e&496)return e;g=new C(f.left,f.top);g instanceof C?(a=g.x,g=g.y):(a=g,g=void 0);b.style.left=ne(a,!1);b.style.top=ne(g,!1);g=new Wb(f.width,f.height);c==g||c&&g&&c.width==g.width&&c.height==g.height||(c=g,g=ec(Xb(Zb(b)).b),!B||Ib("10")||g&&Ib("8")?(b=b.style,tb?b.MozBoxSizing="border-box":ub?b.WebkitBoxSizing="border-box":b.boxSizing="border-box",b.width=Math.max(c.width,
0)+"px",b.height=Math.max(c.height,0)+"px"):(a=b.style,g?(B?(g=te(b,"paddingLeft"),f=te(b,"paddingRight"),d=te(b,"paddingTop"),h=te(b,"paddingBottom"),g=new be(d,f,h,g)):(g=ge(b,"paddingLeft"),f=ge(b,"paddingRight"),d=ge(b,"paddingTop"),h=ge(b,"paddingBottom"),g=new be(parseFloat(d),parseFloat(f),parseFloat(h),parseFloat(g))),!B||9<=Number(Jb)?(f=ge(b,"borderLeftWidth"),d=ge(b,"borderRightWidth"),h=ge(b,"borderTopWidth"),b=ge(b,"borderBottomWidth"),b=new be(parseFloat(h),parseFloat(d),parseFloat(b),
parseFloat(f))):(f=ve(b,"borderLeft"),d=ve(b,"borderRight"),h=ve(b,"borderTop"),b=ve(b,"borderBottom"),b=new be(h,d,b,f)),a.pixelWidth=c.width-b.left-g.left-g.right-b.right,a.pixelHeight=c.height-b.top-g.top-g.bottom-b.bottom):(a.pixelWidth=c.width,a.pixelHeight=c.height)));return e}
function Ae(a,b){return(b&8&&re(a)?b^4:b)&-9}
;function Ce(a){this.b=0;this.w=void 0;this.j=this.f=this.i=null;this.l=this.o=!1;if(a!=sa)try{var b=this;a.call(void 0,function(a){De(b,2,a)},function(a){De(b,3,a)})}catch(c){De(this,3,c)}}
function Ee(){this.next=this.context=this.f=this.i=this.b=null;this.j=!1}
Ee.prototype.reset=function(){this.context=this.f=this.i=this.b=null;this.j=!1};
var Fe=new pd(function(){return new Ee},function(a){a.reset()});
function Ge(a,b,c){var d=Fe.get();d.i=a;d.f=b;d.context=c;return d}
Ce.prototype.then=function(a,b,c){return He(this,wa(a)?a:null,wa(b)?b:null,c)};
Ce.prototype.then=Ce.prototype.then;Ce.prototype.$goog_Thenable=!0;Ce.prototype.cancel=function(a){0==this.b&&xd(function(){var b=new Ie(a);Je(this,b)},this)};
function Je(a,b){if(0==a.b)if(a.i){var c=a.i;if(c.f){for(var d=0,e=null,f=null,g=c.f;g&&(g.j||(d++,g.b==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.b&&1==d?Je(c,b):(f?(d=f,d.next==c.j&&(c.j=d),d.next=d.next.next):Ke(c),Le(c,e,3,b)))}a.i=null}else De(a,3,b)}
function Me(a,b){a.f||2!=a.b&&3!=a.b||Ne(a);a.j?a.j.next=b:a.f=b;a.j=b}
function He(a,b,c,d){var e=Ge(null,null,null);e.b=new Ce(function(a,g){e.i=b?function(c){try{var e=b.call(d,c);a(e)}catch(n){g(n)}}:a;
e.f=c?function(b){try{var e=c.call(d,b);!qa(e)&&b instanceof Ie?g(b):a(e)}catch(n){g(n)}}:g});
e.b.i=a;Me(a,e);return e.b}
Ce.prototype.G=function(a){this.b=0;De(this,2,a)};
Ce.prototype.O=function(a){this.b=0;De(this,3,a)};
function De(a,b,c){if(0==a.b){a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself"));a.b=1;a:{var d=c,e=a.G,f=a.O;if(d instanceof Ce){Me(d,Ge(e||sa,f||null,a));var g=!0}else{if(d)try{var h=!!d.$goog_Thenable}catch(n){h=!1}else h=!1;if(h)d.then(e,f,a),g=!0;else{if(xa(d))try{var l=d.then;if(wa(l)){Oe(d,l,e,f,a);g=!0;break a}}catch(n){f.call(a,n);g=!0;break a}g=!1}}}g||(a.w=c,a.b=b,a.i=null,Ne(a),3!=b||c instanceof Ie||Pe(a,c))}}
function Oe(a,b,c,d,e){function f(a){h||(h=!0,d.call(e,a))}
function g(a){h||(h=!0,c.call(e,a))}
var h=!1;try{b.call(a,g,f)}catch(l){f(l)}}
function Ne(a){a.o||(a.o=!0,xd(a.C,a))}
function Ke(a){var b=null;a.f&&(b=a.f,a.f=b.next,b.next=null);a.f||(a.j=null);return b}
Ce.prototype.C=function(){for(var a;a=Ke(this);)Le(this,a,this.b,this.w);this.o=!1};
function Le(a,b,c,d){if(3==c&&b.f&&!b.j)for(;a&&a.l;a=a.i)a.l=!1;if(b.b)b.b.i=null,Qe(b,c,d);else try{b.j?b.i.call(b.context):Qe(b,c,d)}catch(e){Re.call(null,e)}qd(Fe,b)}
function Qe(a,b,c){2==b?a.i.call(a.context,c):a.f&&a.f.call(a.context,c)}
function Pe(a,b){a.l=!0;xd(function(){a.l&&Re.call(null,b)})}
var Re=rd;function Ie(a){Fa.call(this,a)}
x(Ie,Fa);Ie.prototype.name="cancel";function M(a){Hd.call(this);this.w=1;this.l=[];this.o=0;this.b=[];this.f={};this.C=!!a}
x(M,Hd);k=M.prototype;k.subscribe=function(a,b,c){var d=this.f[a];d||(d=this.f[a]=[]);var e=this.w;this.b[e]=a;this.b[e+1]=b;this.b[e+2]=c;this.w=e+3;d.push(e);return e};
function Se(a,b){var c=!1,d=a.subscribe("ROOT_MENU_REMOVED",function(a){c||(c=!0,this.N(d),b.apply(void 0,arguments))},a)}
function Te(a,b,c){if(b=a.f[b]){var d=a.b;(b=La(b,function(a){return d[a+1]==c&&void 0==d[a+2]}))&&a.N(b)}}
k.N=function(a){var b=this.b[a];if(b){var c=this.f[b];if(0!=this.o)this.l.push(a),this.b[a+1]=sa;else{if(c){var d=Ha(c,a);0<=d&&Array.prototype.splice.call(c,d,1)}delete this.b[a];delete this.b[a+1];delete this.b[a+2]}}return!!b};
k.F=function(a,b){var c=this.f[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.C)for(e=0;e<c.length;e++){var g=c[e];Ue(this.b[g+1],this.b[g+2],d)}else{this.o++;try{for(e=0,f=c.length;e<f;e++)g=c[e],this.b[g+1].apply(this.b[g+2],d)}finally{if(this.o--,0<this.l.length&&0==this.o)for(;c=this.l.pop();)this.N(c)}}return 0!=e}return!1};
function Ue(a,b,c){xd(function(){a.apply(b,c)})}
k.clear=function(a){if(a){var b=this.f[a];b&&(z(b,this.N,this),delete this.f[a])}else this.b.length=0,this.f={}};
function Ve(a,b){if(b){var c=a.f[b];return c?c.length:0}c=0;for(var d in a.f)c+=Ve(a,d);return c}
k.X=function(){M.A.X.call(this);this.clear();this.l.length=0};function We(){}
;function Xe(){}
x(Xe,We);Xe.prototype.clear=function(){var a=ae(this.P(!0)),b=this;z(a,function(a){b.remove(a)})};function Ye(a){this.b=a}
x(Ye,Xe);k=Ye.prototype;k.isAvailable=function(){if(!this.b)return!1;try{return this.b.setItem("__sak","1"),this.b.removeItem("__sak"),!0}catch(a){return!1}};
k.set=function(a,b){try{this.b.setItem(a,b)}catch(c){if(0==this.b.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
k.get=function(a){a=this.b.getItem(a);if(!p(a)&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
k.remove=function(a){this.b.removeItem(a)};
k.P=function(a){var b=0,c=this.b,d=new Yd;d.next=function(){if(b>=c.length)throw Xd;var d=c.key(b++);if(a)return d;d=c.getItem(d);if(!p(d))throw"Storage mechanism: Invalid value was encountered";return d};
return d};
k.clear=function(){this.b.clear()};
k.key=function(a){return this.b.key(a)};function Ze(){var a=null;try{a=window.localStorage||null}catch(b){}this.b=a}
x(Ze,Ye);function $e(){var a=null;try{a=window.sessionStorage||null}catch(b){}this.b=a}
x($e,Ye);var af=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^/?#]*)@)?([^/#?]*?)(?::([0-9]+))?(?=[/#?]|$))?([^?#]+)?(?:\?([^#]*))?(?:#([\s\S]*))?$/;function bf(a){return a?decodeURI(a):a}
function cf(a,b){if(!b)return a;var c=a.indexOf("#");0>c&&(c=a.length);var d=a.indexOf("?");if(0>d||d>c){d=c;var e=""}else e=a.substring(d+1,c);c=[a.substr(0,d),e,a.substr(c)];d=c[1];c[1]=b?d?d+"&"+b:b:d;return c[0]+(c[1]?"?"+c[1]:"")+c[2]}
function df(a,b,c){if("array"==ua(b))for(var d=0;d<b.length;d++)df(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function ef(a,b){for(var c=[],d=b||0;d<a.length;d+=2)df(a[d],a[d+1],c);return c.join("&")}
function ff(a){var b=[],c;for(c in a)df(c,a[c],b);return b.join("&")}
function gf(a,b){var c=2==arguments.length?ef(arguments[1],0):ef(arguments,1);return cf(a,c)}
function hf(a,b){var c=ff(b);return cf(a,c)}
;var jf=window.yt&&window.yt.config_||window.ytcfg&&window.ytcfg.data_||{};v("yt.config_",jf);function kf(a){var b=arguments;if(1<b.length)jf[b[0]]=b[1];else{b=b[0];for(var c in b)jf[c]=b[c]}}
function N(a,b){return a in jf?jf[a]:b}
;function lf(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){mf(b)}}:a}
function mf(a){var b=r("yt.logging.errors.log");b?b(a,void 0,void 0,void 0,void 0):(b=N("ERRORS",[]),b.push([a,void 0,void 0,void 0,void 0]),kf("ERRORS",b))}
;function O(a,b){wa(a)&&(a=lf(a));return window.setTimeout(a,b)}
;var nf=r("ytPubsubPubsubInstance")||new M;M.prototype.subscribe=M.prototype.subscribe;M.prototype.unsubscribeByKey=M.prototype.N;M.prototype.publish=M.prototype.F;M.prototype.clear=M.prototype.clear;v("ytPubsubPubsubInstance",nf);var of=r("ytPubsubPubsubSubscribedKeys")||{};v("ytPubsubPubsubSubscribedKeys",of);var pf=r("ytPubsubPubsubTopicToKeys")||{};v("ytPubsubPubsubTopicToKeys",pf);var qf=r("ytPubsubPubsubIsSynchronous")||{};v("ytPubsubPubsubIsSynchronous",qf);
function rf(a,b,c){var d=sf();if(d){var e=d.subscribe(a,function(){var d=arguments;var g=function(){of[e]&&b.apply(c||window,d)};
try{qf[a]?g():O(g,0)}catch(h){mf(h)}},c);
of[e]=!0;pf[a]||(pf[a]=[]);pf[a].push(e);return e}return 0}
function tf(a){var b=sf();b&&(ra(a)?a=[a]:p(a)&&(a=[parseInt(a,10)]),z(a,function(a){b.unsubscribeByKey(a);delete of[a]}))}
function P(a,b){var c=sf();return c?c.publish.apply(c,arguments):!1}
function uf(a,b){qf[a]=!0;var c=sf();c&&c.publish.apply(c,arguments);qf[a]=!1}
function sf(){return r("ytPubsubPubsubInstance")}
;function vf(a,b,c){a&&(a.dataset?a.dataset[wf(b)]=String(c):a.setAttribute("data-"+b,c))}
function xf(a,b){return a?a.dataset?a.dataset[wf(b)]:a.getAttribute("data-"+b):null}
function yf(a,b){a&&(a.dataset?delete a.dataset[wf(b)]:a.removeAttribute("data-"+b))}
var zf={};function wf(a){return zf[a]||(zf[a]=String(a).replace(/\-([a-z])/g,function(a,c){return c.toUpperCase()}))}
;function Q(a,b){this.version=a;this.args=b}
;function R(a,b){this.topic=a;this.b=b}
R.prototype.toString=function(){return this.topic};function Af(a){var b=void 0;isNaN(b)&&(b=void 0);var c=r("yt.scheduler.instance.addJob");c?c(a,1,b):void 0===b?a():O(a,b||0)}
;function Bf(){}
function Cf(){}
Bf.prototype=aa(Cf.prototype);Bf.prototype.constructor=Bf;if(fa)fa(Bf,Cf);else for(var Df in Cf)if("prototype"!=Df)if(Object.defineProperties){var Ef=Object.getOwnPropertyDescriptor(Cf,Df);Ef&&Object.defineProperty(Bf,Df,Ef)}else Bf[Df]=Cf[Df];Bf.A=Cf.prototype;Bf.prototype.start=function(){var a=r("yt.scheduler.instance.start");a&&a()};
ta(Bf);Bf.v();var Ff=r("ytPubsub2Pubsub2Instance")||new M;M.prototype.subscribe=M.prototype.subscribe;M.prototype.unsubscribeByKey=M.prototype.N;M.prototype.publish=M.prototype.F;M.prototype.clear=M.prototype.clear;v("ytPubsub2Pubsub2Instance",Ff);var Gf=r("ytPubsub2Pubsub2SubscribedKeys")||{};v("ytPubsub2Pubsub2SubscribedKeys",Gf);var Hf=r("ytPubsub2Pubsub2TopicToKeys")||{};v("ytPubsub2Pubsub2TopicToKeys",Hf);var If=r("ytPubsub2Pubsub2IsAsync")||{};v("ytPubsub2Pubsub2IsAsync",If);
v("ytPubsub2Pubsub2SkipSubKey",null);function T(a,b){var c=Jf();c&&c.publish.call(c,a.toString(),a,b)}
function Kf(a,b,c){var d=Jf();if(!d)return 0;var e=d.subscribe(a.toString(),function(d,g){var f=r("ytPubsub2Pubsub2SkipSubKey");f&&f==e||(f=function(){if(Gf[e])try{if(g&&a instanceof R&&a!=d)try{var f=a.b,h=g;if(!h.args||!h.version)throw Error("yt.pubsub2.Data.deserialize(): serializedData is incomplete.");try{if(!f.Ia){var t=new f;f.Ia=t.version}var y=f.Ia}catch(q){}if(!y||h.version!=y)throw Error("yt.pubsub2.Data.deserialize(): serializedData version is incompatible.");try{g=Reflect.construct(f,
Oa(h.args))}catch(q){throw q.message="yt.pubsub2.Data.deserialize(): "+q.message,q;}}catch(q){throw q.message="yt.pubsub2.pubsub2 cross-binary conversion error for "+a.toString()+": "+q.message,q;}b.call(c||window,g)}catch(q){mf(q)}},If[a.toString()]?r("yt.scheduler.instance")?Af(f):O(f,0):f())});
Gf[e]=!0;Hf[a.toString()]||(Hf[a.toString()]=[]);Hf[a.toString()].push(e);return e}
function Lf(a){var b=Jf();b&&(ra(a)&&(a=[a]),z(a,function(a){b.unsubscribeByKey(a);delete Gf[a]}))}
function Jf(){return r("ytPubsub2Pubsub2Instance")}
;var Mf=0;function Nf(a){var b=a.__yt_uid_key;b||(b=Of(),a.__yt_uid_key=b);return b}
function Pf(a,b){a=D(a);b=D(b);return!!yc(a,function(a){return a===b},!0,void 0)}
function Qf(a,b){var c=ac(document,a,null,b);return c.length?c[0]:null}
function Rf(){var a=document,b;Ka(["fullscreenElement","webkitFullscreenElement","mozFullScreenElement","msFullscreenElement"],function(c){b=a[c];return!!b});
return b}
function Sf(){Md(document.body,"hide-players",!1);z($b("preserve-players"),function(a){L(a,"preserve-players")})}
var Of=r("ytDomDomGetNextId")||function(){return++Mf};
v("ytDomDomGetNextId",Of);var Tf={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function Uf(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.shiftKey=this.ctrlKey=this.altKey=!1;this.clientY=this.clientX=0;this.changedTouches=this.touches=null;if(a=a||window.event){this.event=a;for(var b in a)b in Tf||(this[b]=a[b]);(b=a.target||a.srcElement)&&3==b.nodeType&&(b=b.parentNode);this.target=b;if(b=a.relatedTarget)try{b=b.nodeName?b:null}catch(c){b=null}else"mouseover"==this.type?b=a.fromElement:
"mouseout"==this.type&&(b=a.toElement);this.relatedTarget=b;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey}}
Uf.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
Uf.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
Uf.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var fb=r("ytEventsEventsListeners")||{};v("ytEventsEventsListeners",fb);var Vf=r("ytEventsEventsCounter")||{count:0};v("ytEventsEventsCounter",Vf);function Wf(a,b,c,d){d=void 0===d?!1:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return eb(function(e){return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&e[4]==!!d})}
function U(a,b,c,d){d=void 0===d?!1:d;if(!a||!a.addEventListener&&!a.attachEvent)return"";var e=Wf(a,b,c,d);if(e)return e;e=++Vf.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(d){d=new Uf(d);if(!yc(d.relatedTarget,function(b){return b==a},!0))return d.currentTarget=a,d.type=b,c.call(a,d)}:function(b){b=new Uf(b);
b.currentTarget=a;return c.call(a,b)};
g=lf(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),a.addEventListener(b,g,d)):a.attachEvent("on"+b,g);fb[e]=[a,b,c,g,d];return e}
function Xf(a,b,c){var d=a||document;return U(d,"click",function(a){var e=yc(a.target,function(a){return a===d||c(a)},!0);
e&&e!==d&&!e.disabled&&(a.currentTarget=e,b.call(e,a))})}
function Yf(a){a=a||window.event;a=a.target||a.srcElement;3==a.nodeType&&(a=a.parentNode);return a}
function Zf(a,b,c){return Xf(a,b,function(a){return J(a,c)})}
function $f(a){if(document.createEvent){var b=document.createEvent("HTMLEvents");b.initEvent("click",!0,!0);a.dispatchEvent(b)}else b=document.createEventObject(),a.fireEvent("onclick",b)}
function V(a){a&&("string"==typeof a&&(a=[a]),z(a,function(a){if(a in fb){var b=fb[a],d=b[0],e=b[1],f=b[3];b=b[4];d.removeEventListener?d.removeEventListener(e,f,b):d.detachEvent&&d.detachEvent("on"+e,f);delete fb[a]}}))}
;var ag={},bg="ontouchstart"in document;function cg(a,b,c){switch(a){case "mouseover":case "mouseout":var d=3;break;case "mouseenter":case "mouseleave":d=9}return yc(c,function(a){return J(a,b)},!0,d)}
function dg(a){var b="mouseover"==a.type&&"mouseenter"in ag||"mouseout"==a.type&&"mouseleave"in ag,c=a.type in ag||b;if("HTML"!=a.target.tagName&&c){if(b){b="mouseover"==a.type?"mouseenter":"mouseleave";c=ag[b];for(var d in c.f){var e=cg(b,d,a.target);e&&!yc(a.relatedTarget,function(a){return a==e},!0)&&c.F(d,e,b,a)}}if(b=ag[a.type])for(d in b.f)(e=cg(a.type,d,a.target))&&b.F(d,e,a.type,a)}}
U(document,"blur",dg,!0);U(document,"change",dg,!0);U(document,"click",dg);U(document,"focus",dg,!0);U(document,"mouseover",dg);U(document,"mouseout",dg);U(document,"mousedown",dg);U(document,"keydown",dg);U(document,"keyup",dg);U(document,"keypress",dg);U(document,"cut",dg);U(document,"paste",dg);bg&&(U(document,"touchstart",dg),U(document,"touchend",dg),U(document,"touchcancel",dg));function W(a){this.l=a;this.w={};this.G=[];this.C=[]}
k=W.prototype;k.B=function(a){return F(a,X(this))};
function X(a,b){return"yt-uix"+(a.l?"-"+a.l:"")+(b?"-"+b:"")}
k.unregister=function(){tf(this.G);this.G.length=0;Lf(this.C);this.C.length=0};
k.init=sa;k.dispose=sa;function eg(a,b,c){a.G.push(rf(b,c,a))}
function fg(a,b,c){a.C.push(Kf(b,c,a))}
function Y(a,b,c,d){d=X(a,d);var e=u(c,a);b in ag||(ag[b]=new M);ag[b].subscribe(d,e);a.w[c]=e}
function Z(a,b,c,d){if(b in ag){var e=ag[b];Te(e,X(a,d),a.w[c]);0>=Ve(e)&&(e.dispose(),delete ag[b])}delete a.w[c]}
k.L=function(a,b,c){var d=this.g(a,b);if(d&&(d=r(d))){var e=Ra(arguments,2);Qa(e,0,0,a);d.apply(null,e)}};
k.g=function(a,b){return xf(a,b)};
function gg(a,b){vf(a,"tooltip-text",b)}
;var hg=window.yt&&window.yt.uix&&window.yt.uix.widgets_||{};v("yt.uix.widgets_",hg);function ig(a){"?"==a.charAt(0)&&(a=a.substr(1));a=a.split("&");for(var b={},c=0,d=a.length;c<d;c++){var e=a[c].split("=");if(1==e.length&&e[0]||2==e.length){var f=decodeURIComponent((e[0]||"").replace(/\+/g," "));e=decodeURIComponent((e[1]||"").replace(/\+/g," "));f in b?"array"==ua(b[f])?Pa(b[f],e):b[f]=[b[f],e]:b[f]=e}}return b}
;function jg(a){a=void 0===a?{}:a;wa(a)&&(a={callback:a});if(a.gapiHintOverride||N("GAPI_HINT_OVERRIDE")){var b=document.location.href;-1!=b.indexOf("?")?(b=(b||"").split("#")[0],b=b.split("?",2),b=ig(1<b.length?b[1]:b[0])):b={};(b=b.gapi_jsh)&&hb(a,{_c:{jsl:{h:b}}})}nd("gapi.iframes:gapi.iframes.style.common",a)}
;function kg(){return r("gapi.iframes.getContext")()}
;function lg(a){Q.call(this,1,arguments);this.b=a}
x(lg,Q);function mg(a){Q.call(this,1,arguments);this.b=a}
x(mg,Q);function ng(a,b,c){Q.call(this,3,arguments);this.i=a;this.f=b;this.b=null!=c?!!c:null}
x(ng,Q);function og(a,b,c,d,e){Q.call(this,2,arguments);this.f=a;this.b=b;this.j=c||null;this.i=d||null;this.source=e||null}
x(og,Q);function pg(a,b,c){Q.call(this,1,arguments);this.b=a;this.f=b}
x(pg,Q);function qg(a,b,c,d,e,f,g){Q.call(this,1,arguments);this.f=a;this.l=b;this.b=c;this.o=d||null;this.j=e||null;this.i=f||null;this.source=g||null}
x(qg,Q);
var rg=new R("subscription-batch-subscribe",lg),sg=new R("subscription-batch-unsubscribe",lg),tg=new R("subscription-subscribe",og),ug=new R("subscription-subscribe-loading",mg),vg=new R("subscription-subscribe-loaded",mg),wg=new R("subscription-subscribe-success",pg),xg=new R("subscription-subscribe-external",og),yg=new R("subscription-unsubscribe",qg),zg=new R("subscription-unsubscirbe-loading",mg),Ag=new R("subscription-unsubscribe-loaded",mg),Bg=new R("subscription-unsubscribe-success",mg),Cg=
new R("subscription-external-unsubscribe",qg),Dg=new R("subscription-enable-ypc",mg),Eg=new R("subscription-disable-ypc",mg),Fg=new R("subscription-prefs",ng),Gg=new R("subscription-prefs-success",ng),Hg=new R("subscription-prefs-failure",ng);function Ig(){var a=Rf();return a?a:null}
;function Jg(a,b){(a=D(a))&&a.style&&(a.style.display=b?"":"none",Md(a,"hid",!b))}
function Kg(a){return(a=D(a))?"none"!=a.style.display&&!J(a,"hid"):!1}
function Lg(a){z(arguments,function(a){!va(a)||a instanceof Element?Jg(a,!0):z(a,function(a){Lg(a)})})}
function Mg(a){z(arguments,function(a){!va(a)||a instanceof Element?Jg(a,!1):z(a,function(a){Mg(a)})})}
;function Ng(){W.call(this,"tooltip");this.b=0;this.f={}}
x(Ng,W);ta(Ng);k=Ng.prototype;k.register=function(){Y(this,"mouseover",this.T);Y(this,"mouseout",this.H);Y(this,"focus",this.pa);Y(this,"blur",this.ka);Y(this,"click",this.H);Y(this,"touchstart",this.Ga);Y(this,"touchend",this.V);Y(this,"touchcancel",this.V)};
k.unregister=function(){Z(this,"mouseover",this.T);Z(this,"mouseout",this.H);Z(this,"focus",this.pa);Z(this,"blur",this.ka);Z(this,"click",this.H);Z(this,"touchstart",this.Ga);Z(this,"touchend",this.V);Z(this,"touchcancel",this.V);this.dispose();Ng.A.unregister.call(this)};
k.dispose=function(){for(var a in this.f)this.H(this.f[a]);this.f={}};
k.T=function(a){if(!(this.b&&1E3>Ea()-this.b)){var b=parseInt(this.g(a,"tooltip-hide-timer"),10);b&&(yf(a,"tooltip-hide-timer"),window.clearTimeout(b));b=u(function(){Og(this,a);yf(a,"tooltip-show-timer")},this);
var c=parseInt(this.g(a,"tooltip-show-delay"),10)||0;b=O(b,c);vf(a,"tooltip-show-timer",b.toString());a.title&&(gg(a,Pg(this,a)),a.title="");b=ya(a).toString();this.f[b]=a}};
k.H=function(a){var b=parseInt(this.g(a,"tooltip-show-timer"),10);b&&(window.clearTimeout(b),yf(a,"tooltip-show-timer"));b=u(function(){if(a){var b=D(Qg(this,a));b&&(Rg(b),ic(b),yf(a,"content-id"));b=D(Qg(this,a,"arialabel"));ic(b)}yf(a,"tooltip-hide-timer")},this);
b=O(b,50);vf(a,"tooltip-hide-timer",b.toString());if(b=this.g(a,"tooltip-text"))a.title=b;b=ya(a).toString();delete this.f[b]};
k.pa=function(a,b){this.b=0;this.T(a,b)};
k.ka=function(a){this.b=0;this.H(a)};
k.Ga=function(a,b,c){c.changedTouches&&(this.b=0,(a=cg(b,X(this),c.changedTouches[0].target))&&this.T(a,b))};
k.V=function(a,b,c){c.changedTouches&&(this.b=Ea(),(a=cg(b,X(this),c.changedTouches[0].target))&&this.H(a))};
function Sg(a,b,c){gg(b,c);a=a.g(b,"content-id");(a=D(a))&&mc(a,c)}
function Pg(a,b){return a.g(b,"tooltip-text")||b.title}
function Og(a,b){if(b){var c=Pg(a,b);if(c){var d=D(Qg(a,b));if(!d){d=document.createElement("div");d.id=Qg(a,b);d.className=X(a,"tip");var e=document.createElement("div");e.className=X(a,"tip-body");var f=document.createElement("div");f.className=X(a,"tip-arrow");var g=document.createElement("div");g.setAttribute("aria-hidden","true");g.className=X(a,"tip-content");var h=Tg(a,b),l=Qg(a,b,"content");g.id=l;vf(b,"content-id",l);e.appendChild(g);h&&d.appendChild(h);d.appendChild(e);d.appendChild(f);
var n=vc(b);l=Qg(a,b,"arialabel");f=document.createElement("div");K(f,X(a,"arialabel"));f.id=l;n=b.hasAttribute("aria-label")?b.getAttribute("aria-label"):"rtl"==document.body.getAttribute("dir")?c+" "+n:n+" "+c;mc(f,n);b.setAttribute("aria-labelledby",l);l=Ig()||document.body;l.appendChild(f);l.appendChild(d);Sg(a,b,c);(c=parseInt(a.g(b,"tooltip-max-width"),10))&&e.offsetWidth>c&&(e.style.width=c+"px",K(g,X(a,"normal-wrap")));g=J(b,X(a,"reverse"));Ug(a,b,d,e,h,g)||Ug(a,b,d,e,h,!g);var t=X(a,"tip-visible");
O(function(){K(d,t)},0)}}}}
function Ug(a,b,c,d,e,f){Md(c,X(a,"tip-reverse"),f);var g=0;f&&(g=1);var h=oe(b);f=new C((h.width-10)/2,f?h.height:0);var l=le(b);Be(new C(l.x+f.x,l.y+f.y),c,g);f=dc(window);if(1==c.nodeType)var n=me(c);else c=c.changedTouches?c.changedTouches[0]:c,n=new C(c.clientX,c.clientY);c=oe(d);var t=Math.floor(c.width/2);g=!!(f.height<n.y+h.height);h=!!(n.y<h.height);l=!!(n.x<t);f=!!(f.width<n.x+t);n=(c.width+3)/-2- -5;a=a.g(b,"force-tooltip-direction");if("left"==a||l)n=-5;else if("right"==a||f)n=20-c.width-
3;a=Math.floor(n)+"px";d.style.left=a;e&&(e.style.left=a,e.style.height=c.height+"px",e.style.width=c.width+"px");return!(g||h)}
function Qg(a,b,c){a=X(a)+Nf(b);c&&(a+="-"+c);return a}
function Tg(a,b){var c=null;wb&&J(b,X(a,"masked"))&&((c=D("yt-uix-tooltip-shared-mask"))?(c.parentNode.removeChild(c),Lg(c)):(c=document.createElement("IFRAME"),c.src='javascript:""',c.id="yt-uix-tooltip-shared-mask",c.className=X(a,"tip-mask")));return c}
function Rg(a){var b=D("yt-uix-tooltip-shared-mask"),c=b&&yc(b,function(b){return b==a},!1,2);
b&&c&&(b.parentNode.removeChild(b),Mg(b),document.body.appendChild(b))}
;function Vg(a){var b=Wg();if(b=window.open(b,"loginPopup","width=375,height=440,resizable=yes,scrollbars=yes",!0)){var c=rf("LOGGED_IN",function(b){tf(N("LOGGED_IN_PUBSUB_KEY",void 0));kf("LOGGED_IN",!0);a(b)});
kf("LOGGED_IN_PUBSUB_KEY",c);b.moveTo((screen.width-375)/2,(screen.height-440)/2)}}
function Wg(){var a=document.location.protocol+"//"+document.domain+"/post_login";a=gf(a,"mode","subscribe");a=gf("/signin?context=popup","next",a);return a=gf(a,"feature","sub_button")}
v("yt.pubsub.publish",P);var Xg=Object.create(null);Xg.log_event="GENERIC_EVENT_LOGGING";Xg.log_interaction="INTERACTION_LOGGING";v("ytLoggingTransportLogPayloadsQueue_",r("ytLoggingTransportLogPayloadsQueue_")||{});v("ytLoggingTransportTokensToCttTargetIds_",r("ytLoggingTransportTokensToCttTargetIds_")||{});v("ytLoggingTransportDispatchedStats_",r("ytLoggingTransportDispatchedStats_")||{});v("ytytLoggingTransportCapturedTime_",r("ytLoggingTransportCapturedTime_")||{});Ea();var Yg=qa(XMLHttpRequest)?function(){return new XMLHttpRequest}:qa(ActiveXObject)?function(){return new ActiveXObject("Microsoft.XMLHTTP")}:null;
function Zg(){if(!Yg)return null;var a=Yg();return"open"in a?a:null}
;var $g={"X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL","X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},ah=!1;
function bh(a,b){b=void 0===b?{}:b;if(!c)var c=window.location.href;var d=a.match(af)[1]||null,e=bf(a.match(af)[3]||null);d&&e?(d=c,c=a.match(af),d=d.match(af),c=c[3]==d[3]&&c[1]==d[1]&&c[4]==d[4]):c=e?bf(c.match(af)[3]||null)==e&&(Number(c.match(af)[4]||null)||null)==(Number(a.match(af)[4]||null)||null):!0;for(var f in $g){if((e=d=N($g[f]))&&!(e=c)){e=f;var g=N("CORS_HEADER_WHITELIST")||{},h=bf(a.match(af)[3]||null);e=h?(g=g[h])?Ma(g,e):!1:!0}e&&(b[f]=d)}return b}
function ch(a,b){var c=b.format||"JSON";a=dh(a,b);var d=eh(a,b),e=!1,f,g=fh(a,function(a){if(!e){e=!0;f&&window.clearTimeout(f);a:switch(a&&"status"in a?a.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:var d=!0;break a;default:d=!1}var g=null;if(d||400<=a.status&&500>a.status)g=gh(c,a,b.Qb);if(d)a:if(a&&204==a.status)d=!0;else{switch(c){case "XML":d=0==parseInt(g&&g.return_code,10);break a;case "RAW":d=!0;break a}d=!!g}g=g||{};var h=b.context||m;d?b.M&&b.M.call(h,
a,g):b.onError&&b.onError.call(h,a,g);b.ba&&b.ba.call(h,a,g)}},b.method,d,b.headers,b.responseType,b.withCredentials);
b.yb&&0<b.timeout&&(f=O(function(){e||(e=!0,g.abort(),window.clearTimeout(f),b.yb.call(b.context||m,g))},b.timeout))}
function dh(a,b){b.Sb&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=N("XSRF_FIELD_NAME",void 0),d=b.Ha;if(d){d[c]&&delete d[c];d=d||{};var e=a.split("#",2);c=e[0];e=1<e.length?"#"+e[1]:"";var f=c.split("?",2);c=f[0];f=ig(f[1]||"");for(var g in d)f[g]=d[g];a=hf(c,f)+e}return a}
function eh(a,b){var c=N("XSRF_FIELD_NAME",void 0),d=N("XSRF_TOKEN",void 0),e=b.postBody||"",f=b.J,g=N("XSRF_FIELD_NAME",void 0),h;b.headers&&(h=b.headers["Content-Type"]);b.Rb||bf(a.match(af)[3]||null)&&!b.withCredentials&&bf(a.match(af)[3]||null)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.J&&b.J[g]||(f||(f={}),f[c]=d);f&&p(e)&&(e=ig(e),hb(e,f),e=b.Bb&&"JSON"==b.Bb?JSON.stringify(e):ff(e));if(!(c=e)&&(c=f)){a:{for(l in f){var l=!1;break a}l=!0}c=!l}!ah&&
c&&"POST"!=b.method&&(ah=!0,mf(Error("AJAX request with postData should use POST")));return e}
function gh(a,b,c){var d=null;switch(a){case "JSON":a=b.responseText;b=b.getResponseHeader("Content-Type")||"";a&&0<=b.indexOf("json")&&(d=JSON.parse(a));break;case "XML":if(b=(b=b.responseXML)?hh(b):null)d={},z(b.getElementsByTagName("*"),function(a){d[a.tagName]=ih(a)})}c&&jh(d);
return d}
function jh(a){if(xa(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;var d=Ub(a[b]);a[c]=d}else jh(a[b])}}
function hh(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function ih(a){var b="";z(a.childNodes,function(a){b+=a.nodeValue});
return b}
function fh(a,b,c,d,e,f,g){function h(){4==(l&&"readyState"in l?l.readyState:0)&&b&&lf(b)(l)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var l=Zg();if(!l)return null;"onloadend"in l?l.addEventListener("loadend",h,!1):l.onreadystatechange=h;l.open(c,a,!0);f&&(l.responseType=f);g&&(l.withCredentials=!0);c="POST"==c;if(e=bh(a,e))for(var n in e)l.setRequestHeader(n,e[n]),"content-type"==n.toLowerCase()&&(c=!1);c&&l.setRequestHeader("Content-Type","application/x-www-form-urlencoded");l.send(d);return l}
;var kh=Ea().toString();var lh;a:{if(window.crypto&&window.crypto.getRandomValues)try{var mh=Array(16),nh=new Uint8Array(16);window.crypto.getRandomValues(nh);for(var oh=0;oh<mh.length;oh++)mh[oh]=nh[oh];lh=mh;break a}catch(a){}for(var ph=Array(16),qh=0;16>qh;qh++){for(var rh=Ea(),sh=0;sh<rh%23;sh++)ph[qh]=Math.random();ph[qh]=Math.floor(256*Math.random())}if(kh)for(var th=1,uh=0;uh<kh.length;uh++)ph[th%16]=ph[th%16]^ph[(th-1)%16]/4^kh.charCodeAt(uh),th++;lh=ph}
for(var vh=lh,wh=[],xh=0;xh<vh.length;xh++)wh.push("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_".charAt(vh[xh]&63));(new Ze).isAvailable();(new $e).isAvailable();function yh(){W.call(this,"button");this.b=null;this.i=[];this.f={}}
x(yh,W);ta(yh);k=yh.prototype;k.register=function(){Y(this,"click",this.Ja);Y(this,"keydown",this.ta);Y(this,"keypress",this.ua);eg(this,"page-scroll",this.lb)};
k.unregister=function(){Z(this,"click",this.Ja);Z(this,"keydown",this.ta);Z(this,"keypress",this.ua);zh(this);this.f={};yh.A.unregister.call(this)};
k.Ja=function(a){a&&!a.disabled&&(Ah(this,a),this.click(a))};
k.ta=function(a,b,c){if(!(c.altKey||c.ctrlKey||c.shiftKey)&&(b=Bh(this,a))){var d=function(a){var b="";a.tagName&&(b=a.tagName.toLowerCase());return"ul"==b||"table"==b},e;
d(b)?e=b:e=nc(b,d);if(e){e=e.tagName.toLowerCase();if("ul"==e)var f=this.sb;else"table"==e&&(f=this.rb);f&&Ch(this,a,b,c,u(f,this))}}};
k.lb=function(){var a=this.f,b=0;for(d in a)b++;if(0!=b)for(var c in a){b=a[c];var d=F(b.activeButtonNode||b.parentNode,X(this));if(void 0==d||void 0==b)break;Dh(this,d,b,!0)}};
function Ch(a,b,c,d,e){var f=Kg(c),g=9==d.keyCode;if(g||32==d.keyCode||13==d.keyCode)if(d=Eh(a,c)){if(qa(d.firstElementChild))b=d.firstElementChild;else for(b=d.firstChild;b&&1!=b.nodeType;)b=b.nextSibling;if("a"==b.tagName.toLowerCase()){var h=void 0===h?{}:h;var l=void 0===l?"":l;var n=void 0===n?window:n;n=n.location;h=hf(b.href,h)+l;h instanceof Nb||h instanceof Nb||(h=h.Z?h.Y():String(h),Pb.test(h)||(h="about:invalid#zClosurez"),h=Qb(h));h instanceof Nb&&h.constructor===Nb&&h.f===Ob?h=h.b:(ua(h),
h="type_error:SafeUrl");n.href=h}else $f(b)}else g&&Fh(a,b);else f?27==d.keyCode?(Eh(a,c),Fh(a,b)):e(b,c,d):(h=J(b,X(a,"reverse"))?38:40,d.keyCode==h&&($f(b),d.preventDefault()))}
k.ua=function(a,b,c){c.altKey||c.ctrlKey||c.shiftKey||(a=Bh(this,a),Kg(a)&&c.preventDefault())};
function Eh(a,b){var c=X(a,"menu-item-highlight"),d=E(c,b);d&&L(d,c);return d}
function Gh(a,b,c){K(c,X(a,"menu-item-highlight"));var d=c.getAttribute("id");d||(d=X(a,"item-id-"+ya(c)),c.setAttribute("id",d));b.setAttribute("aria-activedescendant",d)}
k.rb=function(a,b,c){var d=Eh(this,b);if(d){var e=Qf("table",b);b=ac(document,"td",null,e);d=Hh(d,b,ac(document,"td",null,Qf("tr",e)).length,c);-1!=d&&(Gh(this,a,b[d]),c.preventDefault())}};
k.sb=function(a,b,c){if(40==c.keyCode||38==c.keyCode){var d=Eh(this,b);d&&(b=Ia(ac(document,"li",null,b),Kg),Gh(this,a,b[Hh(d,b,1,c)]),c.preventDefault())}};
function Hh(a,b,c,d){var e=b.length;a=Ha(b,a);if(-1==a)if(38==d.keyCode)a=e-c;else{if(37==d.keyCode||38==d.keyCode||40==d.keyCode)a=0}else 39==d.keyCode?(a%c==c-1&&(a-=c),a+=1):37==d.keyCode?(0==a%c&&(a+=c),--a):38==d.keyCode?(a<c&&(a+=e),a-=c):40==d.keyCode&&(a>=e-c&&(a-=e),a+=c);return a}
function Ih(a,b){var c=b.iframeMask;c||(c=document.createElement("IFRAME"),c.src='javascript:""',c.className=X(a,"menu-mask"),Mg(c),b.iframeMask=c);return c}
function Dh(a,b,c,d){var e=F(b,X(a,"group")),f=!!a.g(b,"button-menu-ignore-group");e=e&&!f?e:b;f=9;var g=8,h=qe(b);if(J(b,X(a,"reverse"))){f=8;g=9;h=h.top+"px";try{c.style.maxHeight=h}catch(t){}}J(b,"flip")&&(J(b,X(a,"reverse"))?(f=12,g=13):(f=13,g=12));var l;a.g(b,"button-has-sibling-menu")?l=je(e):a.g(b,"button-menu-root-container")&&(l=Jh(a,b));B&&!Ib("8")&&(l=null);if(l){var n=qe(l);n=new be(-n.top,n.left,n.top,-n.left)}l=new C(0,1);J(b,X(a,"center-menu"))&&(l.x-=Math.round((oe(c).width-oe(b).width)/
2));d&&(l.y+=fc(document).y);if(a=Ih(a,b))b=oe(c),a.style.width=b.width+"px",a.style.height=b.height+"px",ze(e,f,a,g,l,n,197),d&&de(a,"position","fixed");ze(e,f,c,g,l,n,197)}
function Jh(a,b){if(a.g(b,"button-menu-root-container")){var c=a.g(b,"button-menu-root-container");return F(b,c)}return document.body}
k.La=function(a){if(a){var b=Bh(this,a);if(b){a.setAttribute("aria-pressed","true");a.setAttribute("aria-expanded","true");b.originalParentNode=b.parentNode;b.activeButtonNode=a;b.parentNode.removeChild(b);var c;this.g(a,"button-has-sibling-menu")?c=a.parentNode:c=Jh(this,a);c.appendChild(b);b.style.minWidth=a.offsetWidth-2+"px";var d=Ih(this,a);d&&c.appendChild(d);(c=!!this.g(a,"button-menu-fixed"))&&(this.f[Nf(a).toString()]=b);Dh(this,a,b,c);uf("yt-uix-button-menu-before-show",a,b);Lg(b);d&&Lg(d);
this.L(a,"button-menu-action",!0);K(a,X(this,"active"));b=u(this.Ka,this,a,!1);d=u(this.Ka,this,a,!0);c=u(this.Db,this,a,void 0);this.b&&Bh(this,this.b)==Bh(this,a)||zh(this);P("yt-uix-button-menu-show",a);V(this.i);this.i=[U(document,"click",d),U(document,"contextmenu",b),U(window,"resize",c)];this.b=a}}};
function Fh(a,b){if(b){var c=Bh(a,b);if(c){a.b=null;b.setAttribute("aria-pressed","false");b.setAttribute("aria-expanded","false");b.removeAttribute("aria-activedescendant");Mg(c);a.L(b,"button-menu-action",!1);var d=Ih(a,b),e=Nf(c).toString();delete a.f[e];O(function(){d&&d.parentNode&&(Mg(d),d.parentNode.removeChild(d));c.originalParentNode&&(c.parentNode.removeChild(c),c.originalParentNode.appendChild(c),c.originalParentNode=null,c.activeButtonNode=null)},1)}e=F(b,X(a,"group"));
var f=[X(a,"active")];e&&f.push(X(a,"group-active"));Ld(b,f);P("yt-uix-button-menu-hide",b);V(a.i);a.i.length=0}}
k.Db=function(a,b){var c=Bh(this,a);if(c){b&&(b instanceof Rb?c.innerHTML=Tb(b):mc(c,b));var d=!!this.g(a,"button-menu-fixed");Dh(this,a,c,d)}};
k.Ka=function(a,b,c){c=Yf(c);var d=F(c,X(this));if(d){d=Bh(this,d);var e=Bh(this,a);if(d==e)return}d=F(c,X(this,"menu"));e=d==Bh(this,a);var f=J(c,X(this,"menu-item")),g=J(c,X(this,"menu-close"));if(!d||e&&(f||g))Fh(this,a),d&&b&&this.g(a,"button-menu-indicate-selected")&&((a=E(X(this,"content"),a))&&mc(a,vc(c)),Kh(this,d,c))};
function Kh(a,b,c){var d=X(a,"menu-item-selected");z($b(d,b),function(a){L(a,d)});
K(c.parentNode,d)}
function Bh(a,b){if(!b.widgetMenu){var c=a.g(b,"button-menu-id");c=c&&D(c);var d=X(a,"menu");c?Kd(c,[d,X(a,"menu-external")]):c=E(d,b);b.widgetMenu=c}return b.widgetMenu}
k.isToggled=function(a){return J(a,X(this,"toggled"))};
function Ah(a,b){if(a.g(b,"button-toggle")){var c=F(b,X(a,"group")),d=X(a,"toggled"),e=J(b,d);if(c&&a.g(c,"button-toggle-group")){var f=a.g(c,"button-toggle-group");z($b(X(a),c),function(a){a!=b||"optional"==f&&e?(L(a,d),a.removeAttribute("aria-pressed")):(K(b,d),a.setAttribute("aria-pressed","true"))})}else e?b.removeAttribute("aria-pressed"):b.setAttribute("aria-pressed","true"),Od(b,d)}}
k.click=function(a){if(Bh(this,a)){var b=Bh(this,a);if(b){var c=F(b.activeButtonNode||b.parentNode,X(this));c&&c!=a?(Fh(this,c),O(u(this.La,this,a),1)):Kg(b)?Fh(this,a):this.La(a)}a.focus()}this.L(a,"button-action")};
function zh(a){a.b&&Fh(a,a.b)}
;function Lh(a){W.call(this,a);this.i=null}
x(Lh,W);k=Lh.prototype;k.B=function(a){var b=W.prototype.B.call(this,a);return b?b:a};
k.register=function(){eg(this,"yt-uix-kbd-nav-move-out-done",this.hide)};
k.dispose=function(){Mh(this);Lh.A.dispose.call(this)};
k.g=function(a,b){var c=Lh.A.g.call(this,a,b);return c?c:(c=Lh.A.g.call(this,a,"card-config"))&&(c=r(c))&&c[b]?c[b]:null};
k.show=function(a){var b=this.B(a);if(b){K(b,X(this,"active"));var c=Nh(this,a,b);if(c){c.cardTargetNode=a;c.cardRootNode=b;Oh(this,a,c);var d=X(this,"card-visible"),e=this.g(a,"card-delegate-show")&&this.g(b,"card-action");this.L(b,"card-action",a);this.i=a;Mg(c);O(u(function(){e||(Lg(c),P("yt-uix-card-show",b,a,c));Ph(c);K(c,d);P("yt-uix-kbd-nav-move-in-to",c)},this),10)}}};
function Nh(a,b,c){var d=c||b,e=X(a,"card");c=Qh(a,d);var f=D(X(a,"card")+Nf(d));if(f)return a=E(X(a,"card-body"),f),lc(a,c)||(ic(c),a.appendChild(c)),f;f=document.createElement("div");f.id=X(a,"card")+Nf(d);f.className=e;(d=a.g(d,"card-class"))&&Kd(f,d.split(/\s+/));d=document.createElement("div");d.className=X(a,"card-border");b=a.g(b,"orientation")||"horizontal";e=document.createElement("div");e.className="yt-uix-card-border-arrow yt-uix-card-border-arrow-"+b;var g=document.createElement("div");
g.className=X(a,"card-body");a=document.createElement("div");a.className="yt-uix-card-body-arrow yt-uix-card-body-arrow-"+b;ic(c);g.appendChild(c);d.appendChild(a);d.appendChild(g);f.appendChild(e);f.appendChild(d);document.body.appendChild(f);return f}
function Oh(a,b,c){var d=a.g(b,"orientation")||"horizontal",e=E(X(a,"anchor"),b)||b,f=a.g(b,"position"),g=!!a.g(b,"force-position"),h=a.g(b,"position-fixed");d="horizontal"==d;var l="bottomright"==f||"bottomleft"==f,n="topright"==f||"bottomright"==f;if(n&&l){var t=13;var y=8}else n&&!l?(t=12,y=9):!n&&l?(t=9,y=12):(t=8,y=13);var q=re(document.body);f=re(b);q!=f&&(t^=4);if(d){f=b.offsetHeight/2-12;var I=new C(-12,b.offsetHeight+6)}else f=b.offsetWidth/2-6,I=new C(b.offsetWidth+6,-12);var w=oe(c);f=
Math.min(f,(d?w.height:w.width)-24-6);6>f&&(f=6,d?I.y+=12-b.offsetHeight/2:I.x+=12-b.offsetWidth/2);w=null;g||(w=10);b=X(a,"card-flip");a=X(a,"card-reverse");Md(c,b,n);Md(c,a,l);w=ze(e,t,c,y,I,null,w);!g&&w&&(w&48&&(n=!n,t^=4,y^=4),w&192&&(l=!l,t^=1,y^=1),Md(c,b,n),Md(c,a,l),ze(e,t,c,y,I));h&&(e=parseInt(c.style.top,10),g=fc(document).y,de(c,"position","fixed"),de(c,"top",e-g+"px"));q&&(c.style.right="",e=qe(c),e.left=e.left||parseInt(c.style.left,10),g=dc(window),c.style.left="",c.style.right=g.width-
e.left-e.width+"px");e=E("yt-uix-card-body-arrow",c);g=E("yt-uix-card-border-arrow",c);d=d?l?"top":"bottom":!q&&n||q&&!n?"left":"right";e.setAttribute("style","");g.setAttribute("style","");e.style[d]=f+"px";g.style[d]=f+"px";l=E("yt-uix-card-arrow",c);n=E("yt-uix-card-arrow-background",c);l&&n&&(c="right"==d?oe(c).width-f-13:f+11,f=c/Math.sqrt(2),l.style.left=c+"px",l.style.marginLeft="1px",n.style.marginLeft=-f+"px",n.style.marginTop=f+"px")}
k.hide=function(a){if(a=this.B(a)){var b=D(X(this,"card")+Nf(a));b&&(L(a,X(this,"active")),L(b,X(this,"card-visible")),Mg(b),this.i=null,b.cardTargetNode=null,b.cardRootNode=null,b.cardMask&&(ic(b.cardMask),b.cardMask=null))}};
function Mh(a){a.i&&a.hide(a.i)}
k.Cb=function(a,b){var c=this.B(a);if(c){if(b){var d=Qh(this,c);if(!d)return;b instanceof Rb?d.innerHTML=Tb(b):mc(d,b)}J(c,X(this,"active"))&&(c=Nh(this,a,c),Oh(this,a,c),Lg(c),Ph(c))}};
k.isActive=function(a){return(a=this.B(a))?J(a,X(this,"active")):!1};
function Qh(a,b){var c=b.cardContentNode;if(!c){var d=X(a,"content"),e=X(a,"card-content");(c=(c=a.g(b,"card-id"))?D(c):E(d,b))||(c=document.createElement("div"));var f=c;L(f,d);K(f,e);b.cardContentNode=c}return c}
function Ph(a){var b=a.cardMask;b||(b=document.createElement("IFRAME"),b.src='javascript:""',Kd(b,["yt-uix-card-iframe-mask"]),a.cardMask=b);b.style.position=a.style.position;b.style.top=a.style.top;b.style.left=a.offsetLeft+"px";b.style.height=a.clientHeight+"px";b.style.width=a.clientWidth+"px";document.body.appendChild(b)}
;function Rh(){W.call(this,"kbd-nav")}
var Sh;x(Rh,W);ta(Rh);k=Rh.prototype;k.register=function(){Y(this,"keydown",this.ra);eg(this,"yt-uix-kbd-nav-move-in",this.za);eg(this,"yt-uix-kbd-nav-move-in-to",this.tb);eg(this,"yt-uix-kbd-move-next",this.Aa);eg(this,"yt-uix-kbd-nav-move-to",this.R)};
k.unregister=function(){Z(this,"keydown",this.ra);V(Sh)};
k.ra=function(a,b,c){var d=c.keyCode;if(a=F(a,X(this)))switch(d){case 13:case 32:this.za(a);break;case 27:c.preventDefault();c.stopImmediatePropagation();a:{for(c=Wd(a,"kbdNavMoveOut");!c;){c=F(a.parentElement,X(this));if(!c)break a;c=Wd(c,"kbdNavMoveOut")}c=D(c);this.R(c);P("yt-uix-kbd-nav-move-out-done",c)}break;case 40:case 38:if((b=c.target)&&J(a,X(this,"list")))switch(d){case 40:this.Aa(b,a);break;case 38:d=document.activeElement==a,a=Th(a),b=a.indexOf(b),0>b&&!d||(b=d?a.length-1:(a.length+b-
1)%a.length,a[b].focus(),Uh(this,a[b]))}c.preventDefault()}};
k.za=function(a){var b=Wd(a,"kbdNavMoveIn");b=D(b);Vh(this,a,b);this.R(b)};
k.tb=function(a){a:{var b=document;try{var c=b&&b.activeElement;break a}catch(d){}c=null}Vh(this,c,a);this.R(a)};
k.R=function(a){if(a)if(rc(a))a.focus();else{var b=nc(a,function(a){return kc(a)?rc(a):!1});
b?b.focus():(a.setAttribute("tabindex","-1"),a.focus())}};
function Vh(a,b,c){if(b&&c)if(K(c,X(a)),a=b.id,a||(a="kbd-nav-"+Math.floor(1E6*Math.random()+1),b.id=a),b=a,Vd&&c.dataset)c.dataset.kbdNavMoveOut=b;else{if(/-[a-z]/.test("kbdNavMoveOut"))throw Error("");c.setAttribute("data-"+"kbdNavMoveOut".replace(/([A-Z])/g,"-$1").toLowerCase(),b)}}
k.Aa=function(a,b){var c=document.activeElement==b,d=Th(b),e=d.indexOf(a);0>e&&!c||(c=c?0:(e+1)%d.length,d[c].focus(),Uh(this,d[c]))};
function Uh(a,b){if(b){var c=xc(b,"LI");c&&(K(c,X(a,"highlight")),Sh=U(b,"blur",u(function(a){L(a,X(this,"highlight"));V(Sh)},a,c)))}}
function Th(a){if("UL"!=a.tagName.toUpperCase())return[];a=Ia(jc(a),function(a){return"LI"==a.tagName.toUpperCase()});
return Ia(Ja(a,function(a){return Kg(a)?nc(a,function(a){return kc(a)?rc(a):!1}):!1}),function(a){return!!a})}
;function Wh(){W.call(this,"menu");this.f=this.b=null;this.i={};this.o={};this.j=null}
x(Wh,W);ta(Wh);function Xh(a){var b=Wh.v();if(J(a,X(b)))return a;var c=b.B(a);return c?c:F(a,X(b,"content"))==b.b?b.f:null}
k=Wh.prototype;k.register=function(){Y(this,"click",this.qa);Y(this,"mouseenter",this.jb);eg(this,"page-scroll",this.mb);eg(this,"yt-uix-kbd-nav-move-out-done",function(a){a=this.B(a);Yh(this,a)});
this.j=new M};
k.unregister=function(){Z(this,"click",this.qa);this.f=this.b=null;V(Sa(db(this.i)));this.i={};cb(this.o,function(a){ic(a)},this);
this.o={};Id(this.j);this.j=null;Wh.A.unregister.call(this)};
k.qa=function(a,b,c){a&&(b=Zh(this,a),!b.disabled&&Pf(c.target,b)&&$h(this,a))};
k.jb=function(a,b,c){a&&J(a,X(this,"hover"))&&Pf(c.target,Zh(this,a))&&$h(this,a,!0)};
k.mb=function(){this.b&&this.f&&ai(this,this.f,this.b)};
function ai(a,b,c){var d=bi(a,b);if(d){var e=oe(c);if(e instanceof Wb){var f=e.height;e=e.width}else throw Error("missing height argument");d.style.width=ne(e,!0);d.style.height=ne(f,!0)}c==a.b&&(e=9,f=8,J(b,X(a,"reversed"))&&(e^=1,f^=1),J(b,X(a,"flipped"))&&(e^=4,f^=4),a=new C(0,1),d&&ze(b,e,d,f,a,null,197),ze(b,e,c,f,a,null,197))}
function $h(a,b,c){ci(a,b)&&!c?Yh(a,b):(di(a,b),!a.b||Pf(b,a.b)?a.Ma(b):Se(a.j,u(a.Ma,a,b)))}
k.Ma=function(a){if(a){var b=ei(this,a);if(b){uf("yt-uix-menu-before-show",a,b);this.b?Pf(a,this.b)||Yh(this,this.f):(this.f=a,this.b=b,J(a,X(this,"sibling-content"))||(ic(b),document.body.appendChild(b)),b.style.minWidth=Zh(this,a).offsetWidth-2+"px");var c=bi(this,a);c&&b.parentNode&&b.parentNode.insertBefore(c,b.nextSibling);L(b,X(this,"content-hidden"));ai(this,a,b);Kd(Zh(this,a),[X(this,"trigger-selected"),"yt-uix-button-toggled"]);P("yt-uix-menu-show",a);fi(b);gi(this,a);P("yt-uix-kbd-nav-move-in-to",
b);var d=u(this.Eb,this,a),e=u(this.pb,this,a);c=ya(a).toString();this.i[c]=[U(b,"click",e),U(document,"click",d)];J(a,X(this,"indicate-selected"))&&(d=u(this.qb,this,a),this.i[c].push(U(b,"click",d)));J(a,X(this,"hover"))&&(a=u(this.kb,this,a),this.i[c].push(U(document,"mousemove",a)))}}};
k.kb=function(a,b){var c=Yf(b);c&&(Pf(c,Zh(this,a))||hi(this,c)||ii(this,a))};
k.Eb=function(a,b){var c=Yf(b);if(c){if(hi(this,c)){var d=F(c,X(this,"content")),e=xc(c,"LI");e&&d&&lc(d,e)&&uf("yt-uix-menu-item-clicked",c);c=F(c,X(this,"close-on-select"));if(!c)return;d=Xh(c)}Yh(this,d||a)}};
function di(a,b){if(b){var c=F(b,X(a,"content"));c&&z($b(X(a),c),function(a){!Pf(a,b)&&ci(this,a)&&ii(this,a)},a)}}
function Yh(a,b){if(b){var c=[];c.push(b);var d=ei(a,b);d&&(d=$b(X(a),d),d=Oa(d),c=c.concat(d),z(c,function(a){ci(this,a)&&ii(this,a)},a))}}
function ii(a,b){if(b){var c=ei(a,b);Ld(Zh(a,b),[X(a,"trigger-selected"),"yt-uix-button-toggled"]);K(c,X(a,"content-hidden"));var d=ei(a,b);d&&bc(d,{"aria-expanded":"false"});(d=bi(a,b))&&d.parentNode&&ic(d);c&&c==a.b&&(a.f.appendChild(c),a.b=null,a.f=null,a.j&&a.j.F("ROOT_MENU_REMOVED"));P("yt-uix-menu-hide",b);c=ya(b).toString();V(a.i[c]);delete a.i[c]}}
k.pb=function(a,b){var c=Yf(b);c&&ji(this,a,c)};
k.qb=function(a,b){var c=Yf(b);if(c){var d=Zh(this,a);if(d&&(c=xc(c,"LI")))if(c=vc(c).trim(),d.hasChildNodes()){var e=yh.v();(d=E(X(e,"content"),d))&&mc(d,c)}else mc(d,c)}};
function gi(a,b){var c=ei(a,b);if(c){z(c.children,function(a){"LI"==a.tagName&&bc(a,{role:"menuitem"})});
bc(c,{"aria-expanded":"true"});var d=c.id;d||(d="aria-menu-id-"+ya(c),c.id=d);(c=Zh(a,b))&&bc(c,{"aria-controls":d})}}
function ji(a,b,c){var d=ei(a,b);d&&J(b,X(a,"checked"))&&(a=xc(c,"LI"))&&(a=E("yt-ui-menu-item-checked-hid",a))&&(z($b("yt-ui-menu-item-checked",d),function(a){Nd(a,"yt-ui-menu-item-checked","yt-ui-menu-item-checked-hid")}),Nd(a,"yt-ui-menu-item-checked-hid","yt-ui-menu-item-checked"))}
function ci(a,b){var c=ei(a,b);return c?!J(c,X(a,"content-hidden")):!1}
function fi(a){z(ac(document,"UL",null,a),function(a){a.tabIndex=0;var b=Rh.v();Kd(a,[X(b),X(b,"list")])})}
function ei(a,b){var c=xf(b,"menu-content-id");return c&&(c=D(c))?(Kd(c,[X(a,"content"),X(a,"content-external")]),c):b==a.f?a.b:E(X(a,"content"),b)}
function bi(a,b){var c=ya(b).toString(),d=a.o[c];if(!d){d=document.createElement("IFRAME");d.src='javascript:""';var e=[X(a,"mask")];z(Jd(b),function(a){e.push(a+"-mask")});
Kd(d,e);a.o[c]=d}return d||null}
function Zh(a,b){return E(X(a,"trigger"),b)}
function hi(a,b){return Pf(b,a.b)||Pf(b,a.f)}
;function ki(){Lh.call(this,"clickcard");this.b={};this.f={}}
x(ki,Lh);ta(ki);k=ki.prototype;k.register=function(){ki.A.register.call(this);Y(this,"click",this.na,"target");Y(this,"click",this.ma,"close")};
k.unregister=function(){ki.A.unregister.call(this);Z(this,"click",this.na,"target");Z(this,"click",this.ma,"close");for(var a in this.b)V(this.b[a]);this.b={};for(a in this.f)V(this.f[a]);this.f={}};
k.na=function(a,b,c){c.preventDefault();b=xc(c.target,"button");if(!b||!b.disabled){if(b=this.g(a,"card-target"))a=document,a=p(b)?a.getElementById(b):b;b=this.B(a);this.g(b,"disabled")||(J(b,X(this,"active"))?(this.hide(a),L(b,X(this,"active"))):(this.show(a),K(b,X(this,"active"))))}};
k.show=function(a){ki.A.show.call(this,a);var b=this.B(a),c=ya(a).toString();if(!xf(b,"click-outside-persists")){if(this.b[c])return;b=U(document,"click",u(this.oa,this,a));var d=U(window,"blur",u(this.oa,this,a));this.b[c]=[b,d]}a=U(window,"resize",u(this.Cb,this,a,void 0));this.f[c]=a};
k.hide=function(a){ki.A.hide.call(this,a);a=ya(a).toString();var b=this.b[a];b&&(V(b),this.b[a]=null);if(b=this.f[a])V(b),delete this.f[a]};
k.oa=function(a,b){var c="yt-uix"+(this.l?"-"+this.l:"")+"-card",d=null;b.target&&(d=F(b.target,c)||F(Xh(b.target),c));(d=d||F(document.activeElement,c)||F(Xh(document.activeElement),c))||this.hide(a)};
k.ma=function(a){(a=F(a,X(this,"card")))&&(a=a.cardTargetNode)&&this.hide(a)};function li(){Lh.call(this,"hovercard")}
x(li,Lh);ta(li);k=li.prototype;k.register=function(){Y(this,"mouseenter",this.va,"target");Y(this,"mouseleave",this.xa,"target");Y(this,"mouseenter",this.wa,"card");Y(this,"mouseleave",this.ya,"card")};
k.unregister=function(){Z(this,"mouseenter",this.va,"target");Z(this,"mouseleave",this.xa,"target");Z(this,"mouseenter",this.wa,"card");Z(this,"mouseleave",this.ya,"card")};
k.va=function(a){if(mi!=a){mi&&(this.hide(mi),mi=null);var b=u(this.show,this,a),c=parseInt(this.g(a,"delay-show"),10);b=O(b,-1<c?c:200);vf(a,"card-timer",b.toString());mi=a;a.alt&&(vf(a,"card-alt",a.alt),a.alt="");a.title&&(vf(a,"card-title",a.title),a.title="")}};
k.xa=function(a){var b=parseInt(this.g(a,"card-timer"),10);window.clearTimeout(b);this.B(a).isCardHidable=!0;b=parseInt(this.g(a,"delay-hide"),10);b=-1<b?b:200;O(u(this.nb,this,a),b);if(b=this.g(a,"card-alt"))a.alt=b;if(b=this.g(a,"card-title"))a.title=b};
k.nb=function(a){this.B(a).isCardHidable&&(this.hide(a),mi=null)};
k.wa=function(a){a&&(a.cardRootNode.isCardHidable=!1)};
k.ya=function(a){a&&this.hide(a.cardTargetNode)};
var mi=null;function ni(a,b,c,d,e,f){this.b=a;this.w=null;this.i=E("yt-dialog-fg",this.b)||this.b;if(a=E("yt-dialog-title",this.i)){var g="yt-dialog-title-"+ya(this.i);a.setAttribute("id",g);this.i.setAttribute("aria-labelledby",g)}this.i.setAttribute("tabindex","-1");this.O=E("yt-dialog-focus-trap",this.b);this.ea=!1;this.j=new M;this.C=[];this.C.push(Zf(this.b,u(this.ub,this),"yt-dialog-dismiss"));this.C.push(U(this.O,"focus",u(this.ib,this),!0));oi(this);this.Qa=b;this.Xa=c;this.Wa=d;this.G=e;this.Ya=f;this.o=
this.l=null}
var pi={LOADING:"loading",Hb:"content",Ob:"working"};function qi(a,b){a.S()||a.j.subscribe("post-all",b)}
function oi(a){a=E("yt-dialog-fg-content",a.b);var b=[];cb(pi,function(a){b.push("yt-dialog-show-"+a)});
Ld(a,b);K(a,"yt-dialog-show-content")}
k=ni.prototype;
k.show=function(){if(!this.S()){this.w=document.activeElement;if(!this.Wa){this.f||(this.f=D("yt-dialog-bg"),this.f||(this.f=document.createElement("div"),this.f.id="yt-dialog-bg",this.f.className="yt-dialog-bg",document.body.appendChild(this.f)));var a=window,b=a.document;var c=0;if(b){c=b.body;var d=b.documentElement;if(d&&c)if(a=dc(a).height,ec(b)&&d.scrollHeight)c=d.scrollHeight!=a?d.scrollHeight:d.offsetHeight;else{b=d.scrollHeight;var e=d.offsetHeight;d.clientHeight!=e&&(b=c.scrollHeight,e=
c.offsetHeight);c=b>a?b>e?b:e:b<e?b:e}else c=0}this.f.style.height=c+"px";Lg(this.f)}this.sa();c=ri(this);si(c);this.l=U(document,"keydown",u(this.ob,this));c=this.b;d=rf("player-added",this.sa,this);vf(c,"player-ready-pubsub-key",d);this.Xa&&(this.o=U(document,"click",u(this.Ab,this)));Lg(this.b);this.i.setAttribute("tabindex","0");ti(this);this.G||K(document.body,"yt-dialog-active");zh(yh.v());Mh(ki.v());Mh(li.v());P("yt-ui-dialog-show-complete",this)}};
function ui(){return Ka($b("yt-dialog"),function(a){return Kg(a)})}
k.sa=function(){if(!this.Ya){var a=this.b;Md(document.body,"hide-players",!0);a&&Md(a,"preserve-players",!0)}};
function ri(a){var b=ac(document,"iframe",null,a.b);z(b,function(a){var b=xf(a,"onload");b&&(b=r(b))&&U(a,"load",b);if(b=xf(a,"src"))a.src=b},a);
return Oa(b)}
function si(a){z(document.getElementsByTagName("iframe"),function(b){-1==Ha(a,b)&&K(b,"iframe-hid")})}
function vi(){z($b("iframe-hid"),function(a){L(a,"iframe-hid")})}
k.ub=function(a){a=a.currentTarget;a.disabled||(a=xf(a,"action")||"",this.dismiss(a))};
k.dismiss=function(a){if(!this.S()){this.j.F("pre-all");this.j.F("pre-"+a);Mg(this.b);Mh(ki.v());Mh(li.v());this.i.setAttribute("tabindex","-1");ui()||(Mg(this.f),this.G||L(document.body,"yt-dialog-active"),Sf(),vi());this.l&&(V(this.l),this.l=null);this.o&&(V(this.o),this.o=null);var b=this.b;if(b){var c=xf(b,"player-ready-pubsub-key");c&&(tf(c),yf(b,"player-ready-pubsub-key"))}this.j.F("post-all");P("yt-ui-dialog-hide-complete",this);"cancel"==a&&P("yt-ui-dialog-cancelled",this);this.j&&this.j.F("post-"+
a);this.w&&this.w.focus()}};
k.setTitle=function(a){mc(E("yt-dialog-title",this.b),a)};
k.ob=function(a){O(u(function(){this.Qa||27!=a.keyCode||this.dismiss("cancel")},this),0);
9==a.keyCode&&a.shiftKey&&J(document.activeElement,"yt-dialog-fg")&&a.preventDefault()};
k.Ab=function(a){"yt-dialog-base"==a.target.className&&this.dismiss("cancel")};
k.S=function(){return this.ea};
k.dispose=function(){Kg(this.b)&&this.dismiss("dispose");V(this.C);this.C.length=0;O(u(function(){this.w=null},this),0);
this.O=this.i=null;this.j.dispose();this.j=null;this.ea=!0};
k.ib=function(a){a.stopPropagation();ti(this)};
function ti(a){O(u(function(){this.i&&this.i.focus()},a),0)}
v("yt.ui.Dialog",ni);function wi(){W.call(this,"overlay");this.j=this.f=this.i=this.b=null}
x(wi,W);ta(wi);k=wi.prototype;k.register=function(){Y(this,"click",this.ca,"target");Y(this,"click",this.hide,"close");xi(this)};
k.unregister=function(){wi.A.unregister.call(this);Z(this,"click",this.ca,"target");Z(this,"click",this.hide,"close");this.j&&(tf(this.j),this.j=null);this.f&&(V(this.f),this.f=null)};
k.ca=function(a){if(!this.b||!Kg(this.b.b)){var b=this.B(a);a=yi(b,a);b||(b=a?a.overlayParentNode:null);if(b&&a){var c=!!this.g(b,"disable-shortcuts")||!1,d=!!this.g(b,"disable-outside-click-dismiss")||!1;this.b=new ni(a,c);this.i=b;var e=E("yt-dialog-fg",a);if(e){var f=this.g(b,"overlay-class")||"",g=this.g(b,"overlay-style")||"default",h=this.g(b,"overlay-shape")||"default";f=f?f.split(" "):[];f.push(X(this,g));f.push(X(this,h));Kd(e,f)}this.b.show();P("yt-uix-kbd-nav-move-to",e||a);xi(this);c||
d||(c=u(function(a){J(a.target,"yt-dialog-base")&&zi(this)},this),this.f=U(E("yt-dialog-base",a),"click",c));
this.L(b,"overlay-shown");P("yt-uix-overlay-shown",b)}}};
function xi(a){a.j||(a.j=rf("yt-uix-overlay-hide",Ai));a.b&&qi(a.b,function(){var a=wi.v();a.i=null;a.b.dispose();a.b=null})}
function zi(a){if(a.b){var b=a.i;a.b.dismiss("overlayhide");b&&a.L(b,"overlay-hidden");a.i=null;a.f&&(V(a.f),a.f=null);a.b=null}}
function yi(a,b){var c;if(a)if(c=E("yt-dialog",a)){var d=D("body-container");d&&(d.appendChild(c),a.overlayContentNode=c,c.overlayParentNode=a)}else c=a.overlayContentNode;else b&&(c=F(b,"yt-dialog"));return c}
function Bi(){var a=wi.v();if(a.i)a=E("yt-dialog-fg-content",a.i.overlayContentNode);else a:{if(a=$b("yt-dialog-fg-content"))for(var b=0;b<a.length;b++){var c=F(a[b],"yt-dialog");if(Kg(c)){a=a[b];break a}}a=null}return a}
k.hide=function(a){a&&a.disabled||P("yt-uix-overlay-hide")};
function Ai(){zi(wi.v())}
k.show=function(a){this.ca(a)};var Ci={},Di=[];function Ei(a){a=F(a,"yt-uix-button-subscription-container");return E("yt-dialog",E("unsubscribe-confirmation-overlay-container",a))}
function Fi(a,b){V(Di);Di.length=0;Ci[b]||(Ci[b]=Ei(a));wi.v().show(Ci[b]);var c=Bi();return new Ce(function(a){Di.push(Zf(c,function(){a()},"overlay-confirmation-unsubscribe-button"))})}
;function Gi(){var a=N("PLAYER_CONFIG");return a&&a.args&&void 0!==a.args.authuser?!0:!(!N("SESSION_INDEX")&&!N("LOGGED_IN"))}
;function Hi(){W.call(this,"subscription-button")}
x(Hi,W);ta(Hi);Hi.prototype.register=function(){Y(this,"click",this.da);fg(this,ug,this.Ca);fg(this,vg,this.Ba);fg(this,wg,this.xb);fg(this,zg,this.Ca);fg(this,Ag,this.Ba);fg(this,Bg,this.zb);fg(this,Dg,this.wb);fg(this,Eg,this.vb)};
Hi.prototype.unregister=function(){Z(this,"click",this.da);Hi.A.unregister.call(this)};
Hi.prototype.b=function(a){return!!this.g(a,"is-subscribed")};
var Ii={fa:"hover-enabled",Oa:"yt-uix-button-subscribe",Pa:"yt-uix-button-subscribed",Fb:"ypc-enabled",Ra:"yt-uix-button-subscription-container",Sa:"yt-subscription-button-disabled-mask-container"},Ji={Gb:"channel-external-id",Ta:"subscriber-count-show-when-subscribed",Ua:"subscriber-count-tooltip",Va:"subscriber-count-title",Ib:"href",Jb:"insecure",ga:"is-subscribed",Kb:"parent-url",Lb:"clicktracking",Za:"show-unsub-confirm-dialog",Mb:"show-unsub-confirm-time-frame",ab:"style-type",ha:"subscribed-timestamp",
ia:"subscription-id",Nb:"target",bb:"ypc-enabled"};k=Hi.prototype;k.da=function(a){var b=this.g(a,"href"),c=this.g(a,"insecure");if(b)a=this.g(a,"target")||"_self",window.open(b,a);else if(!c)if(Gi()){b=this.g(a,"channel-external-id");c=this.g(a,"clicktracking");var d=Ki(this,a),e=this.g(a,"parent-url");if(this.g(a,"is-subscribed")){var f=this.g(a,"subscription-id"),g=new qg(b,f,d,a,c,e);Li(this,a)?Fi(a,b).then(function(){T(yg,g)}):T(yg,g)}else T(tg,new og(b,d,c,e))}else Mi(this,a)};
k.Ca=function(a){this.K(a.b,this.Ea,!0)};
k.Ba=function(a){this.K(a.b,this.Ea,!1)};
k.xb=function(a){this.K(a.b,this.Fa,!0,a.f)};
k.zb=function(a){this.K(a.b,this.Fa,!1)};
k.wb=function(a){this.K(a.b,this.hb)};
k.vb=function(a){this.K(a.b,this.gb)};
k.Fa=function(a,b,c){b?(vf(a,Ji.ga,"true"),c&&vf(a,Ji.ia,c),this.g(a,Ji.Za)&&(b=new Gd,vf(a,Ji.ha,(b.getTime()/1E3).toString()))):(yf(a,Ji.ga),yf(a,Ji.ha),yf(a,Ji.ia));Ni(this,a)};
function Ki(a,b){if(!a.g(b,"ypc-enabled"))return null;var c=a.g(b,"ypc-item-type"),d=a.g(b,"ypc-item-id");return{itemType:c,itemId:d,subscriptionElement:b}}
k.Ea=function(a,b){var c=F(a,Ii.Ra);Md(c,Ii.Sa,b);a.setAttribute("aria-busy",b?"true":"false");a.disabled=b};
function Ni(a,b){var c=a.g(b,Ji.ab),d=!!a.g(b,"is-subscribed");c="-"+c;var e=Ii.Pa+c;Md(b,Ii.Oa+c,!d);Md(b,e,d);a.g(b,Ji.Ua)&&!a.g(b,Ji.Ta)&&(c=X(Ng.v()),Md(b,c,!d),b.title=d?"":a.g(b,Ji.Va));d?O(function(){K(b,Ii.fa)},1E3):L(b,Ii.fa)}
k.hb=function(a){var b=!!this.g(a,"ypc-item-type"),c=!!this.g(a,"ypc-item-id");!this.g(a,"ypc-enabled")&&b&&c&&(K(a,"ypc-enabled"),vf(a,Ji.bb,"true"))};
k.gb=function(a){this.g(a,"ypc-enabled")&&(L(a,"ypc-enabled"),yf(a,"ypc-enabled"))};
function Oi(a,b){return Ia($b(X(a)),function(a){return b==this.g(a,"channel-external-id")},a)}
k.eb=function(a,b,c){var d=Ra(arguments,2);z(a,function(a){b.apply(this,Na(a,d))},this)};
k.K=function(a,b,c){var d=Oi(this,a);this.eb.apply(this,Na([d],Ra(arguments,1)))};
function Mi(a,b){var c=u(function(a){a.discoverable_subscriptions&&kf("SUBSCRIBE_EMBED_DISCOVERABLE_SUBSCRIPTIONS",a.discoverable_subscriptions);this.da(b)},a);
Vg(c)}
function Li(a,b){if(!a.g(b,"show-unsub-confirm-dialog"))return!1;var c=a.g(b,"show-unsub-confirm-time-frame");return"always"==c||"ten_minutes"==c&&(c=parseInt(a.g(b,"subscribed-timestamp"),10),(new Gd).getTime()<1E3*(c+600))?!0:!1}
;function Pi(a){this.b=a;this.D=null;N("SUBSCRIBE_EMBED_HOVERCARD_URL")&&(Qi(this),U(this.b,"mouseover",u(this.j,this)),U(this.b,"mouseout",u(this.W,this)),U(this.b,"click",u(this.W,this)),Kf(wg,Da(this.f,!0),this),Kf(Bg,Da(this.f,!1),this),Ri(this))}
function Qi(a){var b={url:N("SUBSCRIBE_EMBED_HOVERCARD_URL"),style:"bubble",hideClickDetection:!0,show:!1,anchor:a.b,relayOpen:"-1"};a=u(a.i,a);kg().open(b,a)}
function Ri(a){Gi()||rf("LOGGED_IN",function(){this.D&&(this.W(),this.D.close(),this.D=null,Qi(this))},a)}
Pi.prototype.i=function(a){this.D=a;a=Hi.v().b(this.b);this.f(a)};
Pi.prototype.j=function(){this.D&&this.D.restyle({show:!0})};
Pi.prototype.W=function(){this.D&&this.D.restyle({show:!1})};
Pi.prototype.f=function(a){if(this.D){a={isSubscribed:a};try{this.D.send("msg-hovercard-subscription",a,void 0,r("gapi.iframes.SAME_ORIGIN_IFRAMES_FILTER"))}catch(b){}}};function Si(){jg(function(){var a=oe(D("yt-subscribe"));a={width:a.width,height:a.height};var b=Ti;kg().ready(a,null,b)})}
function Ti(a){if(a.length&&a[a.length-1]){a=a[a.length-1].eurl;var b=D("yt-subscribe"),c=Hi.v();if(b=E(X(c),b))a&&(Hi.v(),vf(b,"parent-url",a)),new Pi(b)}}
;function Ui(a){Q.call(this,1,arguments);this.b=a}
x(Ui,Q);function Vi(a,b){Q.call(this,2,arguments);this.f=a;this.b=b}
x(Vi,Q);function Wi(a,b,c,d){Q.call(this,1,arguments);this.b=b;this.f=c||null;this.itemId=d||null}
x(Wi,Q);function Xi(a,b){Q.call(this,1,arguments);this.f=a;this.b=b||null}
x(Xi,Q);function Yi(a){Q.call(this,1,arguments)}
x(Yi,Q);var Zi=new R("ypc-core-load",Ui),$i=new R("ypc-guide-sync-success",Vi),aj=new R("ypc-purchase-success",Wi),bj=new R("ypc-subscription-cancel",Yi),cj=new R("ypc-subscription-cancel-success",Xi),dj=new R("ypc-init-subscription",Yi);var ej=!1,fj=[];function gj(a){a.b?ej?T(xg,a):T(Zi,new Ui(function(){T(dj,new Yi(a.b))})):hj(a.f,a.j,a.i,a.source)}
function ij(a){a.b?ej?T(Cg,a):T(Zi,new Ui(function(){T(bj,new Yi(a.b))})):jj(a.f,a.l,a.j,a.i,a.source)}
function kj(a){lj(Oa(a.b))}
function mj(a){nj(Oa(a.b))}
function oj(a){pj(a.i,a.f,a.b)}
function qj(a){var b=a.itemId,c=a.b.subscriptionId;b&&c&&T(wg,new pg(b,c,a.b.channelInfo))}
function rj(a){var b=a.b;cb(a.f,function(a,d){T(wg,new pg(d,a,b[d]))})}
function sj(a){T(Bg,new mg(a.f.itemId));a.b&&a.b.length&&(tj(a.b,Bg),tj(a.b,Dg))}
function hj(a,b,c,d){var e=new mg(a);T(ug,e);var f={};f.c=a;c&&(f.eurl=c);d&&(f.source=d);c={};(d=N("PLAYBACK_ID"))&&(c.plid=d);(d=N("EVENT_ID"))&&(c.ei=d);b&&uj(b,c);ch("/subscription_ajax?action_create_subscription_to_channel=1",{method:"POST",Ha:f,J:c,M:function(b,c){var d=c.response;T(wg,new pg(a,d.id,d.channel_info));d.show_feed_privacy_dialog&&P("SHOW-FEED-PRIVACY-SUBSCRIBE-DIALOG",a)},
ba:function(){T(vg,e)}})}
function jj(a,b,c,d,e){var f=new mg(a);T(zg,f);var g={};g.c=a;d&&(g.eurl=d);e&&(g.source=e);d={};d.c=a;d.s=b;(a=N("PLAYBACK_ID"))&&(d.plid=a);(a=N("EVENT_ID"))&&(d.ei=a);c&&uj(c,d);ch("/subscription_ajax?action_remove_subscriptions=1",{method:"POST",Ha:g,J:d,M:function(){T(Bg,f)},
ba:function(){T(Ag,f)}})}
function pj(a,b,c){if(a){var d={};d.channel_id=a;switch(b){case "receive-all-updates":d.receive_all_updates=!0;break;case "receive-no-updates":d.receive_no_updates=!0;d.receive_post_updates=!1;break;case "receive-highlight-updates":d.receive_all_updates=!1;d.receive_no_updates=!1;break;default:return}null===c||d.receive_no_updates||(d.receive_post_updates=c);var e=new ng(a,b,c);ch("/subscription_ajax?action_update_subscription_preferences=1",{method:"POST",J:d,onError:function(){T(Hg,e)},
M:function(){T(Gg,e)}})}}
function lj(a){if(a.length){var b=Qa(a,0,40);T("subscription-batch-subscribe-loading");tj(b,ug);var c={};c.a=b.join(",");var d=function(){T("subscription-batch-subscribe-loaded");tj(b,vg)};
ch("/subscription_ajax?action_create_subscription_to_all=1",{method:"POST",J:c,M:function(c,f){d();var e=f.response,h=e.id;if("array"==ua(h)&&h.length==b.length){var l=e.channel_info_map;z(h,function(a,c){var d=b[c];T(wg,new pg(d,a,l[d]))});
a.length?lj(a):T("subscription-batch-subscribe-finished")}},
onError:function(){d();T("subscription-batch-subscribe-failure")}})}}
function nj(a){if(a.length){var b=Qa(a,0,40);T("subscription-batch-unsubscribe-loading");tj(b,zg);var c={};c.c=b.join(",");var d=function(){T("subscription-batch-unsubscribe-loaded");tj(b,Ag)};
ch("/subscription_ajax?action_remove_subscriptions=1",{method:"POST",J:c,M:function(){d();tj(b,Bg);a.length&&nj(a)},
onError:function(){d()}})}}
function tj(a,b){z(a,function(a){T(b,new mg(a))})}
function uj(a,b){var c=ig(a),d;for(d in c)b[d]=c[d]}
;v("yt.setConfig",kf);v("yt.config.set",kf);v("ytbin.www.subscribeembed.init",function(){ej=!0;fj.push(Kf(tg,gj),Kf(yg,ij));ej||fj.push(Kf(xg,gj),Kf(Cg,ij),Kf(rg,kj),Kf(sg,mj),Kf(Fg,oj),Kf(aj,qj),Kf(cj,sj),Kf($i,rj));var a=Hi.v(),b=X(a);b in hg||(a.register(),eg(a,"yt-uix-init-"+b,a.init),eg(a,"yt-uix-dispose-"+b,a.dispose),hg[b]=a);Si()});}).call(this);
