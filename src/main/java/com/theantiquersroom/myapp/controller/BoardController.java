package com.theantiquersroom.myapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.theantiquersroom.myapp.domain.BoardDTO;
import com.theantiquersroom.myapp.domain.BoardVO;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@RequestMapping("/board")
@Controller
public class BoardController {

//    @Setter(onMethod_= { @Autowired} )
//    private BoardService service;


    @GetMapping("/review")
    public void getReview( ) {
        log.debug("getReview() invoked.");

    } // getReview


    @GetMapping("/getReviewDetail")
    public void getReviewDetail(Integer b_num, Model model ) {
        log.debug("getReviewDetail() invoked.");

//		BoardVO board = this.service.getDetailReview(b_num);
//		log.info("\t+ board: {}" , board);

//		model.addAttribute("board", board);

    } // getReviewDetail


    @GetMapping("/registerReview")
    public void registerReview( ) {
        log.debug("registerReview() invoked.");

    } // registerReview  리뷰작성페이지로 이동


    @PostMapping("/registerReview")
    public String registerReview(BoardDTO board, RedirectAttributes rttrs) {
        log.debug("registerReview()_ invoked.");

        BoardVO vo =
                new BoardVO( // 진수
                        board.getB_num(),
                        board.getB_content(),
                        board.getAuthor(),
                        board.getP_num(),
                        board.getBoard_id(),
                        board.getScore(),
                        null, null);

//		boolean result = this.service.registerReview(vo);
//		rttrs.addAttribute("result", result);

        return "redirect:/board/review";
    } // registerReview  작성된 리뷰정보 DB전달


    @GetMapping("/modifyReview")
    public void modifyReview( ) {
        log.debug("modifyReview() invoked.");

    } // modifyReview  리뷰 수정페이지로 이동


    @PostMapping("/modifyReview")
    public String modify(BoardDTO board, RedirectAttributes rttrs) {
        log.debug("modify({}) invoked." , board);

        // DTO -> VO 변환
        BoardVO vo =
                new BoardVO(
                        board.getB_num(),
                        board.getB_content(),
                        board.getAuthor(),
                        board.getP_num(),
                        board.getBoard_id(),
                        board.getScore(),
                        null, null);

//		boolean result = this.service.modifyReview(vo);

        // 이동되는 화면으로 전송해줘야할 파라미터가 있으면,
        // rttrs 를 사용해야 한다!!!
//		rttrs.addAttribute("result", result);

        return  "redirect:/board/review"; // 이동된 화면 직전에 수행했던게 양식이라면(?) redirect

    } // modifyReview  수정된 리뷰정보 DB전달


    @PostMapping("/removeReview")
    public String removeReview(@RequestParam("b_num") Integer b_num, RedirectAttributes rttrs) {
        log.debug("remove({}) invoked." , b_num);

//		boolean result = this.service.removeReview(b_num);
//		rttrs.addAttribute("result" ,result);

        return  "redirect:/board/review";
    } // removeReview




//---------------------------------------------QnA=============================================

    @GetMapping("/QnA")
    public void getQnA() {	// 문의사항 게시판으로 이동
        log.debug("list() invoked.");


    } // list

    @GetMapping("/getQnADetail")
    public void getQnADetail() {	// 문의사항 상세페이지로 이동
        log.debug("listPerPage() invoked.");

    } // getQnADetail

    @GetMapping("/registerQnA")
    public void registerQnA() {		// 문의사항 작성페이지로 이동
        log.debug("registerQnA() invoked.");

    } // registerQnA

    @PostMapping("/registerQnA")
    public String registerQnA(Model model) { //작성된 문의사항 DB전달
        log.debug("registerQnA({}) invoked.", model);

        // DTO -> VO 변환

        return  "redirect:/board/QnA";
    } // registerQnA

    @GetMapping("/modifyQnA")
    public void modifyQnA() { // 문의사항 수정페이지로 이동
        log.debug("modifyQnA() invoked.");

    } // modifyQnA

    @PostMapping("/modifyQnA()")
    public String modifyQnA(Model model) { // 수정된 문의사항 DB전달
        log.debug("modifyQnA()() invoked.", model);

        return  "redirect:/board/QnA";
    } // modifyQnA()

    @PostMapping("/removeQnA()")
    public void removeQnA() { // 문의게시글 삭제
        log.debug("removeQnA({}) invoked.");

    } // removeQnA()



} // end class
