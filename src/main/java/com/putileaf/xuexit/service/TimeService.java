package com.putileaf.xuexit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Random;

@Service
public class TimeService {
    @Autowired private MyService myService;

    public void testService(){
        //z
        runYun("fid=39037;  _uid=203377794; uf=94ffe74515793f36d488096901cdbd6344cb1d925d1ca306fb61016f532c9ae6bbe0fa7ed8727a6da3fcf73d8a635bcf30d92481d752d66f88b83130e7eb470447967f06c3529f39c04fd8193a78cec6260b22ede7461b6b14d1a086dbd9b2afbe50cd88bd85609daa2ebad65cd196bb; _d=1741487781084; UID=203377794; vc2=BA55DA0AC1E1C007EF7FA1C230A5DB43; vc3=BKM8HZkfL%2FCAkuiZ2VQQhcEw5bAs7N2qUjhui7ojkezx0uLNbrhmCMpm%2BltyMNXWCZL04bjW0F1ECMvdKiOjVOv3t2r%2BmlJ4dqIBHgHImJwCgbFxEll%2FvccUTtTTGwh7JxNHGkOIoWe%2B0VGLk%2B18h4%2BunHjGWTolNkbtvhcu4pI%3Dfa390b36006412e3397e2df8d98958d1; cx_p_token=12ee609720ca6c8c026cc797cd1a1045; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyMDMzNzc3OTQiLCJsb2dpblRpbWUiOjE3NDE0ODc3ODEwODUsImV4cCI6MTc0MjA5MjU4MX0.qGD38trzY9ZS8xPpisOd3dDe2jXElEx2BNGwOgj_9_M; xxtenc=a42aac1c8134a0f246d017b54b133c68; DSSTASH_LOG=C_38-UN_3626-US_203377794-T_1741487781086; spaceFid=39037; spaceRoleId=3; session_oa=MGUwOGVhMjQtZTM2My00NjQ3LWE4OGUtYzk5NWE5ZTkzYjE1; route=6b5f9c5cf712c012a60281ee235d6b97; oa_deptid=39037; oa_uid=203377794; oa_name=%E6%9B%BE%E7%86%A0%E6%99%A8; oa_enc=223901a8ad8fa7a2037e9168fc20df8d",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");
        runYun("fid=39037;  UID=243384068;_d=1741188242116; vc3=YHV13VzjTe2akYiVEUI8KB55TPus7k2g%2BMDJXJON29%2FAQd6%2BTaFYlJby%2FsIlkDlNo6MV47jv4n0owUKGkRM7GA4EwcTXXpIzXBZk%2FdSl5%2BnMr%2BoZRiCvAdTqn0iHJsUWR9IhTpX5EFX6ULqzCAywAxjeUfyzZnLIOvBEUvie4Jc%3Dea8340ab09bcfb805846361f5250838f; session_oa=ZDczYWNkNzQtZmJiMC00YTVhLWE5NTItZGFlMWU5YTVhZWUw;",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");
//wjt
        runYun("fid=39037;  UID=243384068;_d=1741188242116; vc3=YHV13VzjTe2akYiVEUI8KB55TPus7k2g%2BMDJXJON29%2FAQd6%2BTaFYlJby%2FsIlkDlNo6MV47jv4n0owUKGkRM7GA4EwcTXXpIzXBZk%2FdSl5%2BnMr%2BoZRiCvAdTqn0iHJsUWR9IhTpX5EFX6ULqzCAywAxjeUfyzZnLIOvBEUvie4Jc%3Dea8340ab09bcfb805846361f5250838f; session_oa=ZDczYWNkNzQtZmJiMC00YTVhLWE5NTItZGFlMWU5YTVhZWUw;",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");
        //HE
        runYun("fid=142415; _uid=236487332; _d=1772262960068; UID=236487332; vc3=CHEVaVaS%2FP7ZbjPib5VEuXOZUoDcQBIeRmOuJmscjic73ilkO2kk14zjh036L6tTtpSO%2BfaDZGJx9qVnLViUq%2BpjfoSfrDKQbUBh772Fkkyu9tIAktWDdUWSfLqF20XP2EumGfaAmyf6rdyB884%2BWpnjuYdk8LmONyxurgqjHOo%3D7a269433d824b0c5beb3d29525cf07c2; uf=b2d2c93beefa90dcf24ea5556efca4e7e12a4a0721f84caa2985faf6bbbcd1b2e12f802b011cebeccac4d18817a2e3a1b555b7fdd6ee4accea4a1670a3a8352fe9295d8c89b08ad0f44425e20f927c6b23dfa73198c2aef4fb98ce0e6210c3884a878d0a9a7b05da6103a97f8cd189bc111bb980d23bb556d332f295699cc7d6db04d07d88ea117a3424328c742a32f2da9735baa04d8d5fce71fc6e59483dd3564c7cd38c751b2d7ddf848fe860b2519f7341faf7d03f4be9fdc681bdf07734; cx_p_token=81375664bd25637ef2d73f3af19f166c; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyMzY0ODczMzIiLCJsb2dpblRpbWUiOjE3NzIyNjI5NjAwNjksImV4cCI6MTc3Mjg2Nzc2MH0.8IN9KjLlEOeyMUhWvMEliZ91S7kc3B5reyloQGTCMsE; xxtenc=a4f0c18daec8a84b3b5231cfa3bfee9a; DSSTASH_LOG=C_38-UN_3626-US_236487332-T_1772262960070; spaceFid=142415; spaceRoleId=\"\"; session_oa=OTc5OTkyN2MtOTg0Ni00ZmY1LWFmZGYtNmFmNDM1MmJlY2Zl; oa_deptid=39037; oa_uid=236487332; oa_name=%E8%B4%BA%E5%BC%80%E6%A6%9C; oa_enc=76f9cca31f8066270871262a154654a0",
                "Hvr76VktZVd+oNmtjXytOxXf9QosI/p6YvG0R5AESXZJg/SVaYOmTN7OE3Rh4dxyoYwyF4/B77AJB8g8j8ZwemRJqZ1aH/k5YSRq0mUr07lQJuehpO7S+30mtqwyuLgHVIF8DttlYdXXuA5GdhxdN+Emkf6y2k7j0qBrdRTF6gvAV1lk3IpdW2B8BGJvtc3fLzJAqlc29YPaJnZjlbFVcG3T/X3FtFmJKQGB0bvnG38nPwCtQlqdDOUmUTOg5xyuG0vztQfPPD09ac2ojcT5qwGXBHgBvA1nK3KaICWAD8IMVEVwxC6Aqn4xWqmRRXT3DO4l6Ub2D23OiR3zZgUqmkYU6coibj56ATqNdIbMDYl5i5WPnb+lAlbQ25c9CQ6dWx0fXX9rm6446dhRyXERkIC6WPua5fGarj0aZiN3tCc=");
        runYun("route=6d1f56357d38d06d1e74d07b8131eb66; session_oa=MTY4MDY0YzAtMDQ1Ni00ZmRhLWE0M2MtMjkwOTI3OTkzNjI1; fid=39037; _uid=198260240; uf=94ffe74515793f36d488096901cdbd63c588ff1102babd2728a8c9197b6288cebbe0fa7ed8727a6dfb420d589f9a262cdc436c455fddffc288b83130e7eb470447967f06c3529f39c04fd8193a78cec6260b22ede7461b6bb5f77116b35a5778c05b7c8d1cb6d748aa2ebad65cd196bb; _d=1741408205903; UID=198260240; vc2=9E60DFC9876866478773F34169EF5C5A; vc3=Ao84Fo3tvJ6opoX8P9D%2Fe3MshZNRReFYWButKGruXVOMRzLdKnBSfJTphHAu7X%2FjpXs6oOAP8m9yVZL6SAVcUV81aoX%2FnFaHjRza%2F%2FvCiMYKc2nYj%2BKVWRIFGaLhD5HZW9v8KQpdbKOh8RVI9KBPQQGkKPgS9F1I1CCVXZiX6d0%3D8d2b6c95c468e52de5487bcfc85d1de7; cx_p_token=3e31c1813424323871d4471c17d2e43b; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIxOTgyNjAyNDAiLCJsb2dpblRpbWUiOjE3NDE0MDgyMDU5MDUsImV4cCI6MTc0MjAxMzAwNX0.stwDVWrQdHrpRCvidX9go1MTWBLOqPPxD5cXwIWEZjY; xxtenc=ac1e5c56730295afb91f7670aa4c2f91; DSSTASH_LOG=C_38-UN_3626-US_198260240-T_1741408205905; oa_deptid=39037; oa_uid=198260240; oa_name=%E4%BD%99%E5%BF%97%E5%8D%9A; oa_enc=5f2fe9353213a79a614d5332912e4822",
                "0DfmIrPKO4xPWna4qwRFMavRt2U3XysYeuKBeMKrORMrwW/xN/Epp2UWBzCht6RqoO3PCvtcwT/kQmKkBkDBRYPobn8JngvtSzfw3BZZORoztzKOtIn/nsWbjux5fWU2bMeOuKt+v+Ko8h47HsEaGKnPIr/b7Hlx4E2uXDIEIGhMXV0plb5PSKnXuSSr9GnPr/g3fZwuJD1AAFDyExnuQENSBxBmoXgis2qJJXx9BICWPmMdDzC6GmJWp0goAYPdo24Xk64lUHWRhv6HPqfETL3e9PdlgDuksyUroDLqQ0y4e4g4YBHLfpbDC8n1xgQrNyb5D4Qh/mWOJH03AEw/H+8f5saOFJRXbuwpCLk8AMKtvfGbDOMcYYCEfEXV+Igo5b88Q3QQ0AjHFgGp2EE2vy4yYlhY1msvlsITfx/zNoZ+iiPKnktC6UqByE1vItwwDSrXzeC1acYpSPLNRyO47iYNP6FLbLhsoUPqrRlqHWxi7WEHoDwXK5fcIV/1y72yqtMqlhb/hUMDZInFnBYHUFYyLqigGJLMqKybnrD9A531BgliAw/ALXV0s/rx1HDhIxArL2f885mQ5MRMFCBe8L8hjRexSb5lpxTwGnN6NJjYA/EH0WpkwgbWYcNaxsS+cZMXyDNBWNmfmnz9ZYV9RNIJtZERjlpLAWT1Fja+Mly51syhjmlcRILfDWVqbGGPMywDHbs++uIYluu8hO1fHJ9o4SEf+b0FVfWxzO7u7l/SBYtJI9FKCFE1vXfwKMKHztpZW105B2A0aFOkiK2a1CZRQqMgtny81FQdZRpkcc+6RDe15+V809XFGCzabCBjyIPMC4RtPc1p1A/JcAvjF2uz/cE2AmtETIWap14yYe1XBdGZpeTKTcFNjM/2lFV/khlDYB4VGAGDvjsa8YtZS/nuOm5NThAlQllYPuSdPHyGVXaU40HCP4O/llorEQSM9uYwtAc/uCorb+P/gH7Ft2ohwJAuYC4pUpf7yhURWVi7QuPAsxMjFx0zOy2UYv7mANT2rL1qoonnwBPJipBR5EANBArh/OnvbJX3LOFR0EupB7XHbhwY2dqjHLn80Vz7kziaiemviGS82eBFTp73LSnVq0ce+nGqAKM40HO+UbElXJafKspjs7kavqEgGyVUYg3Xpfu2lyGfTn3dMEorXrnTrCidggDyiEARai8Qdx7Uo1DujLJbYNR5jdsQM18mpBx8TZHHSAJpUgTZt0XgeLqwmJ2L3ZeVvdMGgrhy3KhGUcBznN9/9t1bwdWTtGSV4S4VP7BraoavJk0d5Je86QFno4+I91JBXPDATHoGdy9WXfV5/Exj6rRSx+ZnQxcNqQe1x24cGNnaoxy5/NFc+0u5YvGrp7Ohu/HSB0Ooaf65+TMWpM420f3qrdvCP1FuibhQuhD4pYLIwo5ubVYh/NPF4Mlq4zoPpKHO4aD+NbV7F7Tggoy9tdQNmXRV4BaulKdNk/cFLsEKLOAyRMPwBlLy67mNAV/YWxb2X1MCWboFPozL1gHwEAZAqiLIEi1yLnht1pZNnBjaogEGn2KN7MiJedhcq+Fd2yShLOKifMDpn7MP5GZFf6+fbl2btVkOuupuMNOvwSC4yOzsL3c8Og==");


    }

    //定时打卡，每天8：01
    @Scheduled(cron = "0 01 8 * * ?",zone = "Asia/Shanghai")
    public void time0801(){

            // 执行你的业务逻辑
        //he
        runYun("fid=142415; _uid=236487332; uf=b2d2c93beefa90dcf24ea5556efca4e7e12a4a0721f84caa2985faf6bbbcd1b2500856e34427f8f6dee864c18913fb9c03bd6be8a155baf617a3131c5323ef26de6d0eb927bce2d3f8ac0bf266a53391dfd4860a93fcbeea984625cf74d71116dede8b1ac316fba8e7fafd565af53bf2; _d=1741406717169; UID=236487332; vc2=7EEBA7C9DAA72A4AC4C34269584BAA56; vc3=SDDXo3Tt9SCP%2BlBKAQ463cJXt1kBk8bS646H2wvrtnk89T1%2B6AYVO27s0KKa3kLZpkH1BDh2%2BkkO7i%2FnoODwc1%2BosTWOVD5JN1G56tMMobiKZvkE95DksQWcU7iRW3%2BeivkZDEm6QkgpKrIhN2jmfz98xOwCIR0Hi79csOLbroU%3D255a24198972c2c6abe360cb0158cefd; cx_p_token=00fda92f756f1a46152f0f47c25b04a2; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyMzY0ODczMzIiLCJsb2dpblRpbWUiOjE3NDE0MDY3MTcxNzEsImV4cCI6MTc0MjAxMTUxN30.eYuS9YQYBtUj8Y44FPY1P9E_E73xLZ7pdOTNcxGjBEo; xxtenc=a4f0c18daec8a84b3b5231cfa3bfee9a; DSSTASH_LOG=C_38-UN_3626-US_236487332-T_1741406717171; spaceFid=142415; oa_uid=236487332; oa_name=%E8%B4%BA%E5%BC%80%E6%A6%9C; session_oa=ODlhMzE5ODYtMTRhMi00MGM5LTllYmItZjk3NTNmODFkMDI0; route=24b68763a0e084beec86cc31ab344491; oa_deptid=39037; oa_enc=76f9cca31f8066270871262a154654a0",
            "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");


    }
    //w
    @Scheduled(cron = "0 02 8 * * ?",zone = "Asia/Shanghai")
    public void timeW(){
        // 生成一个随机延迟时间，比如 0~3600 秒（0~1 小时）
        int randomDelayInSeconds = new Random().nextInt(3600);
        System.out.println("W随机延迟：" + randomDelayInSeconds + "秒");
        try {
            Thread.sleep(randomDelayInSeconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        //wjt
        runYun("fid=39037;  UID=243384068;_d=1741188242116; vc3=YHV13VzjTe2akYiVEUI8KB55TPus7k2g%2BMDJXJON29%2FAQd6%2BTaFYlJby%2FsIlkDlNo6MV47jv4n0owUKGkRM7GA4EwcTXXpIzXBZk%2FdSl5%2BnMr%2BoZRiCvAdTqn0iHJsUWR9IhTpX5EFX6ULqzCAywAxjeUfyzZnLIOvBEUvie4Jc%3Dea8340ab09bcfb805846361f5250838f; session_oa=ZDczYWNkNzQtZmJiMC00YTVhLWE5NTItZGFlMWU5YTVhZWUw;",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");

    }
    //y
    @Scheduled(cron = "0 01 8 * * ?",zone = "Asia/Shanghai")
    public void timeY(){
        // 生成一个随机延迟时间，比如 0~3600 秒（0~1 小时）
        int randomDelayInSeconds = new Random().nextInt(3600);
        System.out.println("Y随机延迟：" + randomDelayInSeconds + "秒");
        try {
            Thread.sleep(randomDelayInSeconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        //yu
        runYun("route=6d1f56357d38d06d1e74d07b8131eb66; session_oa=MTY4MDY0YzAtMDQ1Ni00ZmRhLWE0M2MtMjkwOTI3OTkzNjI1; fid=39037; _uid=198260240; uf=94ffe74515793f36d488096901cdbd63c588ff1102babd2728a8c9197b6288cebbe0fa7ed8727a6dfb420d589f9a262cdc436c455fddffc288b83130e7eb470447967f06c3529f39c04fd8193a78cec6260b22ede7461b6bb5f77116b35a5778c05b7c8d1cb6d748aa2ebad65cd196bb; _d=1741408205903; UID=198260240; vc2=9E60DFC9876866478773F34169EF5C5A; vc3=Ao84Fo3tvJ6opoX8P9D%2Fe3MshZNRReFYWButKGruXVOMRzLdKnBSfJTphHAu7X%2FjpXs6oOAP8m9yVZL6SAVcUV81aoX%2FnFaHjRza%2F%2FvCiMYKc2nYj%2BKVWRIFGaLhD5HZW9v8KQpdbKOh8RVI9KBPQQGkKPgS9F1I1CCVXZiX6d0%3D8d2b6c95c468e52de5487bcfc85d1de7; cx_p_token=3e31c1813424323871d4471c17d2e43b; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIxOTgyNjAyNDAiLCJsb2dpblRpbWUiOjE3NDE0MDgyMDU5MDUsImV4cCI6MTc0MjAxMzAwNX0.stwDVWrQdHrpRCvidX9go1MTWBLOqPPxD5cXwIWEZjY; xxtenc=ac1e5c56730295afb91f7670aa4c2f91; DSSTASH_LOG=C_38-UN_3626-US_198260240-T_1741408205905; oa_deptid=39037; oa_uid=198260240; oa_name=%E4%BD%99%E5%BF%97%E5%8D%9A; oa_enc=5f2fe9353213a79a614d5332912e4822",
                "0DfmIrPKO4xPWna4qwRFMavRt2U3XysYeuKBeMKrORMrwW/xN/Epp2UWBzCht6RqoO3PCvtcwT/kQmKkBkDBRYPobn8JngvtSzfw3BZZORoztzKOtIn/nsWbjux5fWU2bMeOuKt+v+Ko8h47HsEaGKnPIr/b7Hlx4E2uXDIEIGhMXV0plb5PSKnXuSSr9GnPr/g3fZwuJD1AAFDyExnuQENSBxBmoXgis2qJJXx9BICWPmMdDzC6GmJWp0goAYPdo24Xk64lUHWRhv6HPqfETL3e9PdlgDuksyUroDLqQ0y4e4g4YBHLfpbDC8n1xgQrNyb5D4Qh/mWOJH03AEw/H+8f5saOFJRXbuwpCLk8AMKtvfGbDOMcYYCEfEXV+Igo5b88Q3QQ0AjHFgGp2EE2vy4yYlhY1msvlsITfx/zNoZ+iiPKnktC6UqByE1vItwwDSrXzeC1acYpSPLNRyO47iYNP6FLbLhsoUPqrRlqHWxi7WEHoDwXK5fcIV/1y72yqtMqlhb/hUMDZInFnBYHUFYyLqigGJLMqKybnrD9A531BgliAw/ALXV0s/rx1HDhIxArL2f885mQ5MRMFCBe8L8hjRexSb5lpxTwGnN6NJjYA/EH0WpkwgbWYcNaxsS+cZMXyDNBWNmfmnz9ZYV9RNIJtZERjlpLAWT1Fja+Mly51syhjmlcRILfDWVqbGGPMywDHbs++uIYluu8hO1fHJ9o4SEf+b0FVfWxzO7u7l/SBYtJI9FKCFE1vXfwKMKHztpZW105B2A0aFOkiK2a1CZRQqMgtny81FQdZRpkcc+6RDe15+V809XFGCzabCBjyIPMC4RtPc1p1A/JcAvjF2uz/cE2AmtETIWap14yYe1XBdGZpeTKTcFNjM/2lFV/khlDYB4VGAGDvjsa8YtZS/nuOm5NThAlQllYPuSdPHyGVXaU40HCP4O/llorEQSM9uYwtAc/uCorb+P/gH7Ft2ohwJAuYC4pUpf7yhURWVi7QuPAsxMjFx0zOy2UYv7mANT2rL1qoonnwBPJipBR5EANBArh/OnvbJX3LOFR0EupB7XHbhwY2dqjHLn80Vz7kziaiemviGS82eBFTp73LSnVq0ce+nGqAKM40HO+UbElXJafKspjs7kavqEgGyVUYg3Xpfu2lyGfTn3dMEorXrnTrCidggDyiEARai8Qdx7Uo1DujLJbYNR5jdsQM18mpBx8TZHHSAJpUgTZt0XgeLqwmJ2L3ZeVvdMGgrhy3KhGUcBznN9/9t1bwdWTtGSV4S4VP7BraoavJk0d5Je86QFno4+I91JBXPDATHoGdy9WXfV5/Exj6rRSx+ZnQxcNqQe1x24cGNnaoxy5/NFc+0u5YvGrp7Ohu/HSB0Ooaf65+TMWpM420f3qrdvCP1FuibhQuhD4pYLIwo5ubVYh/NPF4Mlq4zoPpKHO4aD+NbV7F7Tggoy9tdQNmXRV4BaulKdNk/cFLsEKLOAyRMPwBlLy67mNAV/YWxb2X1MCWboFPozL1gHwEAZAqiLIEi1yLnht1pZNnBjaogEGn2KN7MiJedhcq+Fd2yShLOKifMDpn7MP5GZFf6+fbl2btVkOuupuMNOvwSC4yOzsL3c8Og==");

    }
    //z
    @Scheduled(cron = "0 01 8 * * ?",zone = "Asia/Shanghai")
    public void timeZ(){
        // 生成一个随机延迟时间，比如 0~3600 秒（0~1 小时）
        int randomDelayInSeconds = new Random().nextInt(3500);
        System.out.println("Z随机延迟：" + randomDelayInSeconds + "秒");
        try {
            Thread.sleep(randomDelayInSeconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        //z
        runYun("fid=39037;  _uid=203377794; uf=94ffe74515793f36d488096901cdbd6344cb1d925d1ca306fb61016f532c9ae6bbe0fa7ed8727a6da3fcf73d8a635bcf30d92481d752d66f88b83130e7eb470447967f06c3529f39c04fd8193a78cec6260b22ede7461b6b14d1a086dbd9b2afbe50cd88bd85609daa2ebad65cd196bb; _d=1741487781084; UID=203377794; vc2=BA55DA0AC1E1C007EF7FA1C230A5DB43; vc3=BKM8HZkfL%2FCAkuiZ2VQQhcEw5bAs7N2qUjhui7ojkezx0uLNbrhmCMpm%2BltyMNXWCZL04bjW0F1ECMvdKiOjVOv3t2r%2BmlJ4dqIBHgHImJwCgbFxEll%2FvccUTtTTGwh7JxNHGkOIoWe%2B0VGLk%2B18h4%2BunHjGWTolNkbtvhcu4pI%3Dfa390b36006412e3397e2df8d98958d1; cx_p_token=12ee609720ca6c8c026cc797cd1a1045; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyMDMzNzc3OTQiLCJsb2dpblRpbWUiOjE3NDE0ODc3ODEwODUsImV4cCI6MTc0MjA5MjU4MX0.qGD38trzY9ZS8xPpisOd3dDe2jXElEx2BNGwOgj_9_M; xxtenc=a42aac1c8134a0f246d017b54b133c68; DSSTASH_LOG=C_38-UN_3626-US_203377794-T_1741487781086; spaceFid=39037; spaceRoleId=3; session_oa=MGUwOGVhMjQtZTM2My00NjQ3LWE4OGUtYzk5NWE5ZTkzYjE1; route=6b5f9c5cf712c012a60281ee235d6b97; oa_deptid=39037; oa_uid=203377794; oa_name=%E6%9B%BE%E7%86%A0%E6%99%A8; oa_enc=223901a8ad8fa7a2037e9168fc20df8d",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");

    }
    //Wu
    @Scheduled(cron = "0 01 8 * * ?",zone = "Asia/Shanghai")
    public void timeWu(){
        // 生成一个随机延迟时间，比如 0~3600 秒（0~1 小时）
        int randomDelayInSeconds = new Random().nextInt(3500);
        System.out.println("Wu随机延迟：" + randomDelayInSeconds + "秒");
        try {
            Thread.sleep(randomDelayInSeconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        //wu
        runYun("tl=1; _uid=208422914; _d=1742949690149; UID=208422914; vc3=ScIPcaDIMjpMnkrFgRau3ClFLkxm7ndZfQmX6ddJuzU8h6iNbguYnjej5GB1Bn9E%2FPfIJg%2FrF6MWC3%2FNTxxlnvz5c9kHvHNaKXQ9IHoLoT4rEFd4jO3QW3AaSa%2F272mnzUFA2m8Nm6vRme6akPXKkIluc1w%2Fq7%2Bpu6Il4WjNs08%3Dfffb0d5be7afbde2d43aa5b036d82f2e; uf=94ffe74515793f36d488096901cdbd63cb80f1bceb5d72e09c94eb71f57af0534c59635eb4846473648327fa1af564ccd110c105546a283dab5213149d75dadbffcc3e0ecaa21d4f49b4dcd5ab715faafd8d1b9f89f0c1c6a2caeba8547d183abb17bf80e4ba9ed3260b22ede7461b6b9925dacce67289eb2bcac27a479e1c2464d89dae0906d90e; cx_p_token=9019ea118f6d9c3cb67eeb58127e85d2; p_auth_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOiIyMDg0MjI5MTQiLCJsb2dpblRpbWUiOjE3NDI5NDk2OTAxNTAsImV4cCI6MTc0MzU1NDQ5MH0.3br5d0e5cgpJhB1Kbr_tGDcp8cohB5X8r54sSjqPBOE; xxtenc=d67ee4da6ca96e833f5c92dd2c65fdb3; DSSTASH_LOG=C_38-UN_3626-US_208422914-T_1742949690150; wfwfid=31955; fid=31955; source=num2; workRoleBenchId=0; siteType=2; wfwEnc=0B95FEEB0BE267CB22465B2B1B8DC612; styleId=; spaceFid=31955; spaceRoleId=\"\"; session_oa=YTIzNGFiZWUtODM3ZS00MzQ3LTgzZDAtNWFhMTJhZDE3YzM2; route=979f90989291bbaabf5efe25a3f2db16; oa_deptid=39037; oa_uid=208422914; oa_name=%E5%90%B4%E5%AE%87%E6%99%97; oa_enc=0de5920c3589e06b70420954cbd97ee7",
                "Hvr76V0ppVZy45mtB1MzuEe4JiPu72fvw4wGfNHXgqDzhZY288cKLvsHJwTk68dK8pj54tnnPXiMIuePOHv7FYmfoO4atlccDF5UxobPVkR582BiZcust2/1Q0kmXQX6G8v7CPEmcqH/XGGLVT+WDE+CCwj+9mGtvgf4lG22C7GMTw6CdZLTfBheWCVif00QLfVPS6pDzrdDyW6EBtv2AM82wcNXTJnXtAzRmByUNkk41ooRAlTI2RlzW8NfziWKD8/K6EvJ29F5H86wFzBDULaip3kOpBN8zxyq7utO9D/VidKkQir0Tu56SRbb/iaAZTaxazzYfR3I8eIQiF53Zy01q239IJUcNSkJuYhAq7UFVd3IgTGritgY+LG1o1kmpbnkMIlFPKt0");

    }





    public void runYun(String User_Cookie,String formIdValueData){
        Mono<String> checkMono = myService.getCheckCode(User_Cookie);
        String checkCode = checkMono.block();
        System.out.println("checkCode值：" + checkCode);
//        Mono<String> sendMono = myService.sendFormDataAndFormIdValueData(checkCode,User_Cookie,formIdValueData);
        Mono<String> sendMono = myService.sendFormDataNoFormIdValueData(checkCode,User_Cookie);

        String result = sendMono.block();
        System.out.println("加密formIdValueData值：" + result);
//        System.out.println("无加密值：" + result1);

    }


}
