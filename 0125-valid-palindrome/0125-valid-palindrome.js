/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
        // let strs=s.toUpperCase.replace(\[^a-z0-9 ],"");
        s = s.replace(/[^a-zA-Z0-9]/g,"").toLowerCase();
        let t=s;
        s=s.split("");
        let s1;
        s1=s.reverse();
        s1=s1.join("");
        if(s1==t){
         return true;
        }
        else{
        return false;
        }
}
