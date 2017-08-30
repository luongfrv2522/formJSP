//cài phần hover item

function itemClass(){
	this.Link='';
    this.ItemType='';

    this.setInfo=function(link,itemtype){
    	this.Link=link;
    	this.ItemType=itemtype;
    };
    return this;
}


var item1=new itemClass();


item1.setInfo('2','3');

$(document).ready(function() {
    //alert(IC.Link);
    var list=[];
    $("input[name='group_name']").change(function(event) {
    	var val=$(this).attr('value');
    	if($(this).is(':checked')){
    		list.push(val);
    	}
    	else{
    		for(var i=0;i<list.length;i++){
    			if(list[i]==val){
    				list.splice(i,1);
    			}
    		}
    	}
    	$('.item').each(function(index, el) {
    		if(list.length!=0)
    			$(this).hide();
    		else{
    			$(this).show();
    		}
    		var listType=$(this).attr('typeitem');
    		//alert(listType);
    		if(checkMutiGroupType(listType,list)){
    			$(this).show();
    		}
    	});
    	//alert(list);
    });
    
});	

function checkMutiGroupType(listType,list){
	for (var i = list.length - 1; i >= 0; i--) {
		var checkPos=parseInt(listType.search(" "+list[i]+" "));
		if(checkPos<0){
			return false;
		}
    }
    return true;
}