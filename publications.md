---
layout: page
title: Publications
permalink: /publications/
---
{::options auto_ids="false" /}

This page contains selected talks, papers, and other publications.

<a name="upcoming"></a>

## Upcoming

- <a name="DySDoc3"></a>Ahmed Tamrawi, Sharwan Ram, Payas Awadhutkar, Benjamin Holland, Ganesh Ram Santhanam, Suresh Kothari. **DynaDoc: Automated On-Demand Context-Specific Documentation.** *[Third International Workshop on Dynamic Software Documentation (DySDoc3)](https://dysdoc.github.io/dysdoc3)*, Madrid, Spain, September 2018.<br/>
**Paper:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Sample Output](https://ensoftcorp.github.io/DynaDoc/)]
<div class="abstract"><p>This 2018 DOCGEN Challenge paper describes DynaDoc, an automated documentation system for on-demand context-specific documentation. A key novelty is the use of graph database technology with an eXtensible Common Software Graph Schema (XCSG). Using XCSG-based query language, DynaDoc can mine efficiently and accurately a variety of program artifacts and graph abstractions from millions of lines of code to provide semantically relevant and rich documentation. DynaDoc leverages the extensibility of XCSG to incorporate information about commits, issues, and other supplementary artifacts and links that information to program artifacts.</p>
</div>

<a name="2018"></a>

## 2018

- <a name="PCGSCPJournal"></a>Ahmed Tamrawi, Suresh Kothari. **Projected Control Graph for Computing Relevant Program Behaviors.** *[Science of Computer Programming Journal](https://www.sciencedirect.com/journal/science-of-computer-programming)*, Elsevier, October 2018.<br/>
**Talk:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/PCG-SCP-Journal.pdf)]
<div class="abstract">
<p>Many software engineering tasks require analysis and verification of all behaviors relevant to the task. For example, all relevant behaviors must be analyzed to verify a safety or security property. An efficient algorithm must compute the relevant behaviors directly without computing all the behaviors. This is crucial in practice because it is computationally intractable if one were to compute all behaviors to find the subset of relevant behaviors.</p>

<p>We present a mathematical foundation to define relevant behaviors and introduce the Projected Control Graph (PCG) as an abstraction to directly compute the relevant behaviors. We developed a PCG toolbox to facilitate the use of the PCG for program comprehension, analysis, and verification. The toolbox provides: (1) an interactive visual analysis mechanism, and (2) APIs to construct and use PCGs in automated analyses. The toolbox is designed to support multiple programming languages.</p>

<p>Using the toolbox APIs, we conducted a verification case study of the Linux kernel to assess the practical benefits of using the PCG. The study shows that the PCG-based verification is faster and can verify 99% of 66,609 instances compared to the 66% instances verified by the formal verification tool used by the Linux Driver Verification (LDV) organization. This study has revealed bugs missed by the formal verification tool. The second case study is an interactive use of the PCG Smart View to detect side-channel vulnerabilities in Java bytecode.</p>
</div>

- <a name="ICSE2018"></a>Benjamin Holland, Payas Awadhutkar, Suresh Kothari, Ahmed Tamrawi and Jon Mathews. **COMB: Computing Relevant Program Behaviors.** *The 40th International Conference on Software Engineering [(ICSE 2018)](https://www.icse2018.org/)*, Gothenburg, Sweden, May 2018.<br/>
**Paper:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/Computing_Relevant_Program_Behaviors.pdf)]&nbsp;[<a href="https://youtu.be/YoOJ7avBIdk">Video</a>]
<div class="abstract"><p>The paper presents COMB, a tool to improve accuracy and efficiency of software engineering tasks that hinge on computing all relevant program behaviors.</p><p>Computing all behaviors and selecting the relevant ones is computationally intractable. COMB uses Projected Control Graph (PCG) abstraction to derive the relevant behaviors directly and efficiently. The PCG is important as the number of behaviors relevant to a task is often significantly smaller than the totality of behaviors.</p><p>COMB provides extensive capabilities for program comprehension, analysis, and verification. We present a basic case study and a Linux verification study to demonstrate various capabilities of COMB and the addressed challenges. COMB is designed to support multiple programming languages. We demonstrate it for C and Java.</p></div>

- <a name="Springer2018"></a>Suresh Kothari, Ganesh Santhanam, Benjamin Holland, Payas Awadhutkar, and Jon Mathews, Ahmed Tamrawi. **Catastrophic Cyber-Physical Malware.** *Springer Verlag Publishers*, April 2018.<br/>
**Book Chapter:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Chapter](/publications/Catastrophic_Cyber-Physical_Malware.pdf)]
<div class="abstract"><p>With the advent of highly sophisticated cyber-physical malware (CPM) such as Industroyer, a cyberattack could be as destructive as the terrorist attack on 9/11, it would virtually paralyze the nation. We discuss as the major risks the vulnerability of: telecommunication infrastructure, industrial control systems (ICS), and mission-critical software.</p><p>In differentiating CPM from traditional malware, the difference really comes from the open-ended possibilities for malware triggers resulting from the wide spectrum of sensor inputs, and the almost limitless application-specific possibilities for designing malicious payloads.</p><p>Fundamentally, the challenges of detecting sophisticated CPM stem from the complexities inherent in the software at the heart of cyber-physical systems. We discuss three fundamental challenges: explosion of execution behaviors, computational intractability of checking feasible behaviors, and difficult-to-analyze programing constructs.</p><p>In detecting novel CPM, the tasks are: developing plausible hypotheses for malware trigger and mali- cious payload, analyzing software to gather evidence based on CPM hypotheses, and verifying software to prove or refute a hypothesis based on the gathered evidence. We discuss research directions for effective automation to support these tasks.</p></div>

- <a name="Springer2018"></a>Yazan Al-Issa, Mohammad Ashraf Ottom, Ahmed Tamrawi. **Survey on eHealth Cloud Security Challenges.** *[International Journal of Applied Engineering Research](https://www.ripublication.com/ijaer.htm), Research India Publications*, January 2018.<br/>
**Book Chapter:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/survey-ehealth-challenges.pdf)]
<div class="abstract"><p>Cloud computing is a promising technology that is expected to transform the healthcare industry. Cloud computing has many benefits like flexibility, cost and energy savings, resource sharing, and fast deployment. In this paper, we study the use of cloud computing in the healthcare industry and different cloud security challenges. The centralization of data on the cloud moves data ownership to the cloud service provider. A lot of healthcare providers are reluctant to accept this loss of control over their sensitive data. As a result, security, efficiency, and scalability concerns are hindering the wide adoption of the cloud technology. In this work, we found that state of the art solutions addresses only a subset of those concerns. Thus, there is an immediate need for a holistic solution that balances all the contradicting requirements.</p></div>

<a name="2017"></a>

## 2017

- <a name="WSC2017"></a>Ganesh Ram Santhanam, Benjamin Holland, Suresh Kothari, Nikhil Ranade. **Modeling Lessons from Verifying Large Software Systems for Safety and Eecurity.** *[The 2017 Winter Simulation Conference (WSC 2017)](http://meetings2.informs.org/wordpress/wsc2017/)*, Las Vegas, Nevada, December, 2017.<br/>
**Paper:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/modeling-lessongs-wsc2017.pdf)]
<div class="abstract"><p>Verifying software in mission-critical Cyber-Physical Systems (CPS) is an important but daunting task with challenges of accuracy and scalability. This paper discusses lessons learned from verifying properties of the Linux kernel. These lessons have raised questions about traditional verification approaches, and have led us to a model-based approach for software verification. These models are high-level models of the software, as opposed to the prevalent formal methods with low-level representations of software. We use models to gain insights into software verification challenges and use those insights to improve software verification. We demonstrate significant advantages of models with a Linux kernel study involving verification of 66,609 Lock instances. We use models to: (a) analyze and find flaws in verification results from LDV, a top-rated Linux verification tool, (b) show significant improvement over LDV by improving accuracy, speed, and by verifying 99.3% instances compared to 65.7% instances by LDV.</p></div>

<a name="2016"></a>

## 2016

- <a name="APSEC2016"></a>Ahmed Tamrawi, Suresh Kothari. **Projected Control Graph for Accurate and Efficient Analysis of Safety and Security Vulnerabilities.** *The 23rd Asia-Pacific Software Engineering Conference [(APSEC 2016)](http://www.apsec2016.org/)*, Hamilton, New Zealand, December 2016.<br/>
**Paper:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/PCG-WSC2016.pdf)]
<div class="abstract"><p>The goal of path-sensitive analysis (PSA) is to achieve accuracy by accounting precisely for the execution behavior along each path of a control flow graph (CFG). A practical adoption of PSA is hampered by two roadblocks: (a) the exponential growth of the number of CFG paths, and (b) the exponential complexity of a path feasibility check. We introduce projected control graph (PCG) as an optimal mathematical abstraction to address these roadblocks.</p>

<p>The PCG follows from the simple observation that for any given analysis problem, the number of distinct relevant execution behaviors may be much smaller than the number of CFG paths. The PCG is a projection of the CFG to retain only the relevant execution behaviors and elide duplicate paths with identical execution behavior. A mathematical definition of PCG and an efficient algorithm to transform CFG to PCG are presented.</p>

<p>We present an empirical study for three major versions of the Linux kernel to assess the practical benefit of using the optimal mathematical abstraction. As a measure of the efficiency gain, the study reports the reduction from CFG to PCG graphs for all relevant functions for pairing Lock and Unlock on all feasible execution paths. We built a tool to compute these graphs for 66,609 Lock instances. The CFG and PCG graphs with their source correspondence are posted on a website. We used these PCG graphs in a classroom project to audit the results of Lock and Unlock pairing done by the Linux Driver Verification (LDV) tool, the top-rated formal verification tool for the Linux kernel. Our audit has revealed complex Linux bugs missed by LDV.</p></div>

- <a name="ISSREW2016"></a>Suresh Kothari, Payas Awadhutkar, Ahmed Tamrawi. **Insights for Practicing Engineers from a Formal Verification Study of the Linux Kernel.** *The 2016 IEEE International Symposium on Software Reliability Engineering Workshops [ISSREW 2016](http://2016.issre.net/)*, Ottawa, Canada, October 2016.<br/>
**Talk:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/insigts-for-engineers-issrew2016.pdf)]
<div class="abstract"><p>Formal verification of large software has been an illusive target, riddled with the problem of scalability. Even if the obstacle of scale may be cleared, major challenges remain to adopt formal verification in practice. This paper presents an empirical study using a top-rated formal verification tool for Linux, and draws insights from the study to discuss the intrinsic challenges for adopting formal verification in practice. We discuss challenges that focus on practical needs: (a) facilitate crosschecking of verification results, (b) enable the use of formal verification for certification, and (c) integrate formal methods in a development environment. Leaning on visionary papers by Turing Award recipients, we present novel ideas for advancing formal verification in new directions that would help practicing engineers.</p>
</div>

<a name="2015"></a>

## 2015 

<a name="2014"></a>

## 2014

- <a name="SMC2014"></a>Suresh Kothari, Akshay Deepak, Ahmed Tamrawi, Benjamin Holland, Sandeep Krishnan. **A "Human-in-the-loop" Approach for Resolving Complex Software Anomalies.** *The 2014 IEEE International Conference on Systems, Man, and Cybernetics [(SMC 2014)](http://smc2014.org/)*, San Diego, California, October 2014.<br/>
**Paper:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Paper](/publications/A_Human-in-the-loop_Approach_for_Resolving_Complex_Software_Anomalies.pdf)]
<div class="abstract"><p>Automated static analysis tools are widely used in identifying software anomalies, such as memory leak, unsafe thread synchronization and malicious behaviors in smartphone applications. Such anomaly-prone scenarios can be bifurcated into: "ordinary" (analysis requires relatively simple automation) and "complex" (analysis poses extraordinary automation challenges). While automated static analysis tools can resolve ordinary scenarios with high accuracy, automating the analysis of complex scenarios can be very challenging and, at times, infeasible. Even when feasible the cost for full automation can be exorbitant: either in implementing the automation or in sifting through the large number of erroneous results manually. Instead, we appeal for a "Human-in-the-loop" approach called "Amplified Reasoning Technique" (ART). While some of the existing approaches do involve human in the analysis process, the roles played by man and machine are mainly segregated. Whereas, ART puts man and machine in a "loop" in an interactive and visualization-based fashion. This paper makes an attempt to convince its readers to make their analysis of software anomalies ART-based by presenting real-world case studies of complex anomalies and how an ART based approach can be very effective in resolving them. The case studies highlight the desired characteristics of an ART based tool and the type of role it plays in amplifying human intelligence.</p></div>

<a name="2012"></a>

## 2012

- <a name="MSThesis"></a>Ahmed Tamrawi. **Fuzzy Set and Cache-based Approach for Bug Triaging.** *[Iowa State University](https://www.iastate.edu/)*, Ames, Iowa, May 2011.<br/>
**Master's Thesis:**&nbsp;[<a href="#" class="toggle-abstract">Abstract</a>]&nbsp;[[Thesis](https://lib.dr.iastate.edu/etd/12230/)]
<div class="abstract"><p>Software bugs are inevitable and bug fixing is an essential and costly phase during software development. Such defects are often reported in bug reports which are stored in an issue tracking system, or bug repository. Such reports need to be assigned to the most appropriate developers who will eventually fix the issue/bug reported. This process is often called Bug Triaging.</p>

<p>Manual bug triaging is a difficult, expensive, and lengthy process, since it needs the bug triager to manually read, analyze, and assign bug fixers for each newly reported bug. Triagers can become overwhelmed by the number of reports added to the repository. Time and efforts spent into triaging typically diverts valuable resources away from the improvement of the product to the managing of the development process.</p>

<p>To assist triagers and improve the bug triaging efficiency and reduce its cost, this thesis proposes Bugzie, a novel approach for automatic bug triaging based on fuzzy set and cachebased modeling of the bug-fixing capability of developers. Our evaluation results on seven large-scale subject systems show that Bugzie achieves significantly higher levels of efficiency and correctness than existing state-of-the-art approaches. In these subject projects, Bugzie's accuracy for top-1 and top-5 recommendations is higher than those of the second best approach from 4-15% and 6-31%, respectively as Bugzie's top-1 and top-5 recommendation accuracy is generally in the range of 31-51% and 70-83%, respectively. Importantly, existing approaches take from hours to days (even almost a month) to finish training as well as predicting, while in Bugzie, training time is from tens of minutes to an hour.</p></div>