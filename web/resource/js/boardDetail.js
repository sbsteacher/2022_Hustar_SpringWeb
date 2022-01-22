const dataElem = document.querySelector('#data');

const delBtnElem = document.querySelector('#del_btn');
console.log(delBtnElem);
if(delBtnElem) {
    delBtnElem.addEventListener('click', ()=> {
        if(confirm('글을 삭제하시겠습니까?')) {
            const iboard = dataElem.dataset.iboard;
            location.href = `/board/del?iboard=${iboard}`;
        }
    });
}