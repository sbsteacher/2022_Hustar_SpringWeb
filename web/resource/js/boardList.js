const recordList = document.querySelectorAll('.record');
if(recordList) {
    recordList.forEach(item => {
        item.addEventListener('click', () => {
            const iboard = item.dataset.iboard;
            //템플릿 리터럴 '홑따옴표 아니고 `(백틱)(키보드 숫자 1왼쪽에 있는 키)
            location.href = `/board/detail?iboard=${iboard}`;
            //location.href = '/board/detail?iboard=' + iboard; //위 내용과 동일
        });
    });
}